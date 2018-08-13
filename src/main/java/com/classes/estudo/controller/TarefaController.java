package com.classes.estudo.controller;

import com.classes.estudo.model.Tarefa;
import com.classes.estudo.repository.TarefaRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/tarefa")
public class TarefaController extends com.base.controller.Controller<Tarefa, TarefaRepo> {
}