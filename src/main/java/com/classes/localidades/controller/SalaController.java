package com.classes.localidades.controller;

import com.classes.localidades.model.QSala;
import com.classes.localidades.model.Sala;
import com.classes.localidades.repository.SalaRepo;
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
@RequestMapping("/sala")
public class SalaController extends com.base.controller.Controller<Sala, SalaRepo> {
    @Autowired
    SalaRepo salaRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable,
                               @RequestParam(value = "nome", required = false) String nome
    ) {
        if (nome != null) {
            Page<Sala> p = new PageImpl<Sala>(salaRepo.query().select(
                    QSala.sala
            ).from(QSala.sala).
                    where(QSala.sala.numero.likeIgnoreCase("%" + nome + "%")).
                    limit(pageable.getPageSize()).offset(pageable.getOffset()).
                    fetch());
            return new ResponseEntity(p, HttpStatus.OK);
        } else
            return getAll(pageable, null);

    }
}