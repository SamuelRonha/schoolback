package com.classes.localidades.controller;

import com.classes.localidades.model.Telefone;
import com.classes.localidades.repository.TelefoneRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/telefone")
public class TelefoneController extends com.base.controller.Controller<Telefone, TelefoneRepo> {
}