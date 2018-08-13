package com.classes.estudo.controller;

import com.classes.estudo.model.AlunoTrabalho;
import com.classes.estudo.repository.AlunoTrabalhoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/alunotrabalho")
public class AlunoTrabalhoController extends com.base.controller.Controller<AlunoTrabalho, AlunoTrabalhoRepo> {
}