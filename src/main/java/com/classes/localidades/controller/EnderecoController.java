package com.classes.localidades.controller;

import com.classes.localidades.model.Endereco;
import com.classes.localidades.repository.EnderecoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/endereco")
public class EnderecoController extends com.base.controller.Controller<Endereco, EnderecoRepo> {
}