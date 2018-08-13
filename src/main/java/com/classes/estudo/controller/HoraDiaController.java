package com.classes.estudo.controller;

import com.classes.estudo.model.HoraDia;
import com.classes.estudo.repository.HoraDiaRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/horadia")
public class HoraDiaController extends com.base.controller.Controller<HoraDia, HoraDiaRepo> {
}