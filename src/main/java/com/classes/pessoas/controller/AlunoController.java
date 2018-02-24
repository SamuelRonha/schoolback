package com.classes.pessoas.controller;

import com.classes.pessoas.model.Aluno;
import com.classes.pessoas.repository.AlunoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/aluno")
public class AlunoController extends com.base.controller.Controller<Aluno, AlunoRepo> {
}