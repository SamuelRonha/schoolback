package com.classes.estudo.controller;

import com.classes.estudo.model.AlunoTarefa;
import com.classes.estudo.repository.AlunoTarefaRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/alunotarefa")
public class AlunoTarefaController extends com.base.controller.Controller<AlunoTarefa, AlunoTarefaRepo> {
}