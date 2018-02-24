package com.classes.localidades.controller;

import com.classes.localidades.model.Cidade;
import com.classes.localidades.repository.CidadeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/cidade")
public class CidadeController extends com.base.controller.Controller<Cidade, CidadeRepo> {
}