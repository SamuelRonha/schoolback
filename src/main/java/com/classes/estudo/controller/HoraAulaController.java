package com.classes.estudo.controller;

import com.classes.estudo.model.HoraAula;
import com.classes.estudo.repository.HoraAulaRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/horaaula")
public class HoraAulaController extends com.base.controller.Controller<HoraAula, HoraAulaRepo> {
}