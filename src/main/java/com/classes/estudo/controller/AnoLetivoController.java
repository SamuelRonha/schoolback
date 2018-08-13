package com.classes.estudo.controller;

import com.classes.estudo.model.AnoLetivo;
import com.classes.estudo.model.QAnoLetivo;
import com.classes.estudo.repository.AnoLetivoRepo;
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
@RequestMapping("/anoletivo")
public class AnoLetivoController extends com.base.controller.Controller<AnoLetivo, AnoLetivoRepo> {
    @Autowired
    AnoLetivoRepo anoLetivoRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable,
                               @RequestParam(value = "nome", required = false) String nome
    ) {
        if (nome != null) {
            Page<AnoLetivo> p = new PageImpl<AnoLetivo>(anoLetivoRepo.query().select(
                    QAnoLetivo.anoLetivo
            ).from(QAnoLetivo.anoLetivo).
                    where(QAnoLetivo.anoLetivo.nome.likeIgnoreCase("%" + nome + "%")).
                    limit(pageable.getPageSize()).offset(pageable.getOffset()).
                    fetch());
            return new ResponseEntity(p, HttpStatus.OK);
        } else
            return getAll(pageable, null);

    }
}