package com.classes.basicos.controller;

import com.classes.basicos.model.BancoHoras;
import com.classes.basicos.repository.BancoHorasRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin("*")
@RequestMapping("/banco-horas")
public class BancoHorasController extends com.base.controller.Controller<BancoHoras, BancoHorasRepo> {
}
