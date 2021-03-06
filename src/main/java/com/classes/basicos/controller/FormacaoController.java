package com.classes.basicos.controller;

import com.base.controller.Controller;
import com.classes.basicos.model.Formacao;
import com.classes.basicos.model.QFormacao;
import com.classes.basicos.repository.FormacaoRepo;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
@CrossOrigin("*")
@RequestMapping("formacao")
public class FormacaoController extends Controller<Formacao, FormacaoRepo> {
    //    public FormacaoController() {
    @Autowired
    FormacaoRepo formacaoRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable, @RequestParam(value = "nome", required = false) String nome) {
        if (nome != null) {
            Page<Formacao> p = new PageImpl<Formacao>(formacaoRepo.query().select(
                    QFormacao.formacao
            ).from(QFormacao.formacao).
                    where(QFormacao.formacao.descricao.likeIgnoreCase("%" + nome + "%")).
                    limit(pageable.getPageSize()).offset(pageable.getOffset()).
                    fetch());
            return new ResponseEntity(p, HttpStatus.OK);
        } else
            return getAll(pageable, null);

    }
    
}
