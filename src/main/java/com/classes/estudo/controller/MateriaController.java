package com.classes.estudo.controller;

import com.classes.estudo.model.Aula;
import com.classes.estudo.model.Materia;
import com.classes.estudo.model.QMateria;
import com.classes.estudo.repository.MateriaRepo;
import com.classes.pessoas.model.Professor;
import com.classes.pessoas.model.QProfessor;
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

import java.util.ArrayList;
import java.util.List;


@Controller
@CrossOrigin("*")
@RequestMapping("/materia")
public class MateriaController extends com.base.controller.Controller<Materia, MateriaRepo> {
    @Autowired
    MateriaRepo materiaRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable,
                               @RequestParam(value = "nome", required = false) String nome
    ) {
        if (nome != null) {
            Page<Materia> p = new PageImpl<Materia>(materiaRepo.query().select(
                    QMateria.materia
            ).from(QMateria.materia).
                    where(QMateria.materia.nome.likeIgnoreCase("%" + nome + "%")).
                    limit(pageable.getPageSize()).offset(pageable.getOffset()).
                    fetch());
            return new ResponseEntity(p, HttpStatus.OK);
        } else
            return getAll(pageable, null);

    }
}