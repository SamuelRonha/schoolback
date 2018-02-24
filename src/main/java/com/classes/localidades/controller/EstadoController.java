package com.classes.localidades.controller;

import com.classes.localidades.model.Estado;
import com.classes.localidades.repository.EstadoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/estado")
public class EstadoController extends com.base.controller.Controller<Estado, EstadoRepo> {
}