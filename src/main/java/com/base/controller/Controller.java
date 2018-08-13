package com.base.controller;

import com.base.repository.CustomRepo;
import com.classes.pessoas.model.Professor;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin("*")
@RequestMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class Controller<Model, Repo extends CustomRepo> {

    @Autowired
    public Repo jpaRepository;

    public BooleanExpression exp;


    @GetMapping
    @PreAuthorize("hasAuthority('DIRETOR') or hasAuthority('ADMIN')")

    public ResponseEntity getAll(
            Pageable pageable, @RequestParam(required = false) String nome) {
        return new ResponseEntity(
                jpaRepository.findAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('DIRETOR') or hasAuthority('ADMIN')")
    public ResponseEntity<Model> getOne(@PathVariable("id") long id) {
        return new ResponseEntity(jpaRepository.findOne(id), HttpStatus.OK);
    }

    @PostMapping
    @PutMapping("/{id}")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity<?> save(
            @RequestBody @Valid Model model,
            @PathVariable(value = "id", required = false) Long id

    ) {
        return new ResponseEntity(
                jpaRepository.save(model),
                HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity delete(@PathVariable("id") long id) {
        jpaRepository.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }




    @GetMapping("/relat")
//    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity relatorio() {

        return new ResponseEntity(jpaRepository.relatorio(), HttpStatus.OK);
    }


}
