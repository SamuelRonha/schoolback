package com.classes.estudo.controller;

import com.classes.estudo.model.QTurma;
import com.classes.estudo.model.Turma;
import com.classes.estudo.repository.TurmaRepo;
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
@RequestMapping("/turma")
public class TurmaController extends com.base.controller.Controller<Turma, TurmaRepo> {
    @Autowired
    TurmaRepo turmaRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable,
                               @RequestParam(value = "nome", required = false) String nome
    ) {
        if (nome != null) {
            Page<Turma> p = new PageImpl<Turma>(turmaRepo.query().select(
                    QTurma.turma
            ).from(QTurma.turma).
                    where(QTurma.turma.nome.likeIgnoreCase("%" + nome + "%")).
                    limit(pageable.getPageSize()).offset(pageable.getOffset()).
                    fetch());
            return new ResponseEntity(p, HttpStatus.OK);
        } else
            return getAll(pageable, null);

    }
    
}