package com.classes.pessoas.controller;

import com.classes.pessoas.model.Pessoa;
import com.classes.pessoas.repository.PessoaRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/pessoa")
public class PessoaController extends com.base.controller.Controller<Pessoa, PessoaRepo> {
}