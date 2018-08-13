package com.classes.pessoas.controller;

import com.classes.estudo.model.Aula;
import com.classes.estudo.model.Materia;
import com.classes.estudo.repository.AulaRepo;
import com.classes.pessoas.model.Professor;
import com.classes.pessoas.repository.ProfessorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/professor")
public class ProfessorController extends com.base.controller.Controller<Professor, ProfessorRepo> {

    @Autowired
    ProfessorRepo professorRepo;

    @Autowired
    AulaRepo aulaRepo;

    @Override
    public ResponseEntity<?> save(Professor professor, Long id) {
        professor = professorRepo.save(professor);

        for (Materia m : professor.getMaterias()
                ) {

            aulaRepo.save(new Aula(m, professor));
        }

        return new ResponseEntity<Professor>(professor, HttpStatus.CREATED);
    }
}