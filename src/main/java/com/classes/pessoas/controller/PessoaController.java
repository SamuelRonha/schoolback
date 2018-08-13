package com.classes.pessoas.controller;

import com.classes.pessoas.model.Pessoa;
import com.classes.pessoas.model.QPessoa;
import com.classes.pessoas.repository.PessoaRepo;
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
@RequestMapping("/pessoa")
public class PessoaController extends com.base.controller.Controller<Pessoa, PessoaRepo> {
    @Autowired
    PessoaRepo pessoaRepo;
    
    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable, @RequestParam("nome") String nome) {
        Page<Pessoa> p = new PageImpl<Pessoa>(pessoaRepo.query().select(
                QPessoa.pessoa
        ).from(QPessoa.pessoa).
                where(QPessoa.pessoa.nome.likeIgnoreCase("%" + nome + "%")).
                limit(pageable.getPageSize()).offset(pageable.getOffset()).
                fetch());
        return new ResponseEntity(p, HttpStatus.OK);
    }
}