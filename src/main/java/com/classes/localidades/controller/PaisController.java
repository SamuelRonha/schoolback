package com.classes.localidades.controller;


import com.classes.localidades.model.Pais;
import com.classes.localidades.repository.PaisRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/pais")
public class PaisController extends com.base.controller.Controller<Pais, PaisRepo> {
}