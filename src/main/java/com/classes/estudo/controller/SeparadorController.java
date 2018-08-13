package com.classes.estudo.controller;

import com.classes.estudo.model.AnoLetivo;
import com.classes.estudo.model.QAnoLetivo;
import com.classes.estudo.model.Separador;
import com.classes.estudo.repository.SeparadorRepo;
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
@RequestMapping("/separador")
public class SeparadorController extends com.base.controller.Controller<Separador, SeparadorRepo> {
    @Autowired
    SeparadorRepo separadorRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable,
                               @RequestParam(value = "nome", required = false) String nome,
                               @RequestParam(value = "ano", required = true) int id
    ) {

        if (nome != null) {

            Page<AnoLetivo> p = new PageImpl<>(separadorRepo.query().select(
                    (QAnoLetivo.anoLetivo)
            ).from(QAnoLetivo.anoLetivo).
                    where(QAnoLetivo.anoLetivo.separadors.any().nome.likeIgnoreCase("%" + nome + "%")
                            .and(QAnoLetivo.anoLetivo.ano.eq(id))
                    ).
                    limit(pageable.getPageSize()).offset(pageable.getOffset()).
                    fetch());

            List<Separador> a = new ArrayList<>();
            for (AnoLetivo pa : p
                    ) {
                a.addAll(pa.getSeparadors());
            }
            Page<Separador> pa = new PageImpl<Separador>(a);

            return new ResponseEntity(pa, HttpStatus.OK);
        } else
            return getAll(pageable, null);

    }
}