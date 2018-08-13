package com.classes.estudo.controller;

import com.classes.estudo.model.Presenca;
import com.classes.estudo.repository.PresencaRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/presenca")
public class PresencaController extends com.base.controller.Controller<Presenca, PresencaRepo> {
}