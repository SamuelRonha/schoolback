package com.classes.localidades.controller;

import com.classes.localidades.model.Instituicao;
import com.classes.localidades.repository.InstituicaoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/instituicao")
public class InstituicaoController extends com.base.controller.Controller<Instituicao, InstituicaoRepo> {
}