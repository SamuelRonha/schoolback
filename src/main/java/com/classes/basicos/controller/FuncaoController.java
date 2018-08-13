package com.classes.basicos.controller;

import com.classes.basicos.model.Funcao;
import com.classes.basicos.model.QFuncao;
import com.classes.basicos.repository.FuncaoRepo;
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
@RequestMapping("/funcao")
public class FuncaoController extends com.base.controller.Controller<Funcao, FuncaoRepo> {

    @Autowired
    FuncaoRepo funcaoRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable, @RequestParam("nome") String nome) {
        Page<Funcao> p = new PageImpl<Funcao>(funcaoRepo.query().select(
                QFuncao.funcao
        ).from(QFuncao.funcao).
                where(QFuncao.funcao.nome.likeIgnoreCase("%" + nome + "%")).
                limit(pageable.getPageSize()).offset(pageable.getOffset()).
                fetch());
        return new ResponseEntity(p, HttpStatus.OK);
    }
}