package com.classes.localidades.controller;

import com.classes.localidades.model.Sala;
import com.classes.localidades.repository.SalaRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/sala")
public class SalaController extends com.base.controller.Controller<Sala, SalaRepo> {
}