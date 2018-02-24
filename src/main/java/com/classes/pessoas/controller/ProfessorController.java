package com.classes.pessoas.controller;

import com.classes.pessoas.model.Professor;
import com.classes.pessoas.repository.ProfessorRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/professor")
public class ProfessorController extends com.base.controller.Controller<Professor, ProfessorRepo> {
}