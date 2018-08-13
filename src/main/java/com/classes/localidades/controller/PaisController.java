package com.classes.localidades.controller;


import com.classes.localidades.model.Pais;
import com.classes.localidades.model.QPais;
import com.classes.localidades.repository.PaisRepo;
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
@RequestMapping("/pais")
public class PaisController extends com.base.controller.Controller<Pais, PaisRepo> {

    @Autowired
    PaisRepo paisRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable, @RequestParam("nome") String nome) {
        System.out.println(nome);
        Page<Pais> p = new PageImpl<Pais>(paisRepo.query().select(
                QPais.pais
        ).from(QPais.pais).
                where(QPais.pais.nome.likeIgnoreCase("%" + nome + "%")).
                limit(pageable.getPageSize()).offset(pageable.getOffset()).
                fetch());
        return new ResponseEntity(p, HttpStatus.OK);
    }
}