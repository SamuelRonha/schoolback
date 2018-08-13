package com.classes.localidades.controller;

import com.classes.localidades.model.Cidade;
import com.classes.localidades.model.QCidade;
import com.classes.localidades.repository.CidadeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@CrossOrigin("*")
@RequestMapping("/cidade")
public class CidadeController extends com.base.controller.Controller<Cidade, CidadeRepo> {

    @Autowired
    CidadeRepo cidadeRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable, @RequestParam("nome") String nome) {
        Page<Cidade> p = new PageImpl<Cidade>(cidadeRepo.query().select(
                QCidade.cidade
        ).from(QCidade.cidade).
                where(QCidade.cidade.nome.likeIgnoreCase("%" + nome + "%")).
                limit(pageable.getPageSize()).offset(pageable.getOffset()).
                fetch());
        return new ResponseEntity(p, HttpStatus.OK);
    }
}