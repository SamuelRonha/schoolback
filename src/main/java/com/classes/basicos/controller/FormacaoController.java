package com.classes.basicos.controller;

import com.base.controller.Controller;
import com.classes.basicos.model.Formacao;
import com.classes.basicos.model.QFormacao;
import com.classes.basicos.repository.FormacaoRepo;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@CrossOrigin("*")
@RequestMapping("formacao")
public class FormacaoController extends Controller<Formacao, FormacaoRepo> {
    //    public FormacaoController() {
    JPAQuery jpaQuery = new JPAQuery();

    @GetMapping("/some")
    public ResponseEntity something() {
//        Long a =
        JPAQuery<QFormacao> jpaQuery = new JPAQuery();

        System.out.println(jpaQuery.select(QFormacao.formacao.id).from(QFormacao.formacao).fetch());
        return null;
    }
    //    }
    //
}
