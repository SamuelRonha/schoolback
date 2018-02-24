package com.classes.pessoas.controller;

import com.classes.pessoas.model.Funcionario;
import com.classes.pessoas.repository.FuncionarioRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/funcionario")
public class FuncionarioController extends com.base.controller.Controller<Funcionario, FuncionarioRepo> {
}