package com.classes.estudo.controller;

import com.classes.estudo.model.Trabalho;
import com.classes.estudo.repository.TrabalhoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/trabalho")
public class TrabalhoController extends com.base.controller.Controller<Trabalho, TrabalhoRepo> {
}