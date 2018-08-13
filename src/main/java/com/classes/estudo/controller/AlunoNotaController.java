package com.classes.estudo.controller;

import com.classes.estudo.model.AlunoNota;
import com.classes.estudo.repository.AlunoNotaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@CrossOrigin("*")
@RequestMapping("/alunonota")
public class AlunoNotaController extends com.base.controller.Controller<AlunoNota, AlunoNotaRepo> {
    @Autowired
    AlunoNotaRepo alunoNotaRepo;

    @GetMapping("/relatus")
    public ResponseEntity relatorio(Pageable pageable, @RequestParam("id") Long id) {
        return new ResponseEntity(alunoNotaRepo.findOne(id), HttpStatus.OK);
    }

    @GetMapping("/relatogerencial")
    public ResponseEntity relatorioGerencial(Pageable pageable,
                                             @RequestParam("id") Long id) {
        return new ResponseEntity(alunoNotaRepo.findOne(id), HttpStatus.OK);
    }
}