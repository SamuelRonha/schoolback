package com.classes.localidades.controller;

import com.classes.localidades.model.Estado;
import com.classes.localidades.model.QEstado;
import com.classes.localidades.repository.EstadoRepo;
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
@RequestMapping("/estado")
public class EstadoController extends com.base.controller.Controller<Estado, EstadoRepo> {

    @Autowired
    EstadoRepo estadoRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable, @RequestParam("estado.nome") String nome) {
        System.out.println(nome);
        Page<Estado> p = new PageImpl<Estado>(estadoRepo.query().select(
                QEstado.estado
        ).from(QEstado.estado).
                where(QEstado.estado.nome.likeIgnoreCase("%" + nome + "%")).
                limit(pageable.getPageSize()).offset(pageable.getOffset()).
                fetch());
        return new ResponseEntity(p, HttpStatus.OK);
    }


}