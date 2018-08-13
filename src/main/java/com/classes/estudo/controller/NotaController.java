package com.classes.estudo.controller;

import com.classes.estudo.model.Nota;
import com.classes.estudo.repository.NotaRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/nota")
public class NotaController extends com.base.controller.Controller<Nota, NotaRepo> {
}