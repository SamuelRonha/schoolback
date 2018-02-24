package com.classes.pessoas.controller;

import com.classes.pessoas.model.Parentesco;
import com.classes.pessoas.repository.ParentescoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/parentesco")
public class ParentescoController extends com.base.controller.Controller<Parentesco, ParentescoRepo> {
}