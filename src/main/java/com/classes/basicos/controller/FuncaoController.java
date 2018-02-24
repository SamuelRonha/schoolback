package com.classes.basicos.controller;

import com.classes.basicos.model.Funcao;
import com.classes.basicos.repository.FuncaoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/funcao")
public class FuncaoController extends com.base.controller.Controller<Funcao, FuncaoRepo> {
}