package com.classes.basicos.controller;

import com.classes.basicos.model.Requisicao;
import com.classes.basicos.repository.RequisicaoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/requisicao")
public class RequisicaoController extends com.base.controller.Controller<Requisicao, RequisicaoRepo> {
}