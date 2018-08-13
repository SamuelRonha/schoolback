package com.classes.estudo.controller;

import com.classes.estudo.model.Aula;
import com.classes.estudo.model.QAula;
import com.classes.estudo.repository.AulaRepo;
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
@RequestMapping("/aula")
public class AulaController extends com.base.controller.Controller<Aula, AulaRepo> {

    @Autowired
    AulaRepo aulaRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable,
                               @RequestParam(value = "nome", required = false) String nome
    ) {
        if (nome != null) {
            Page<Aula> p = new PageImpl<Aula>(aulaRepo.query().select(
                    QAula.aula
            ).from(QAula.aula).
                    where(QAula.aula.materia.nome.likeIgnoreCase("%" + nome + "%")
//                            .or(QAula.aula.professor.funcionario.pessoa.nome.likeIgnoreCase("%" + nome + "%"))
                    ).
                    limit(pageable.getPageSize()).offset(pageable.getOffset()).
                    fetch());
            return new ResponseEntity(p, HttpStatus.OK);
        } else
            return getAll(pageable, null);

    }
}