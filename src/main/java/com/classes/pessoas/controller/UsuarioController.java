package com.classes.pessoas.controller;

import com.classes.pessoas.model.Usuario;
import com.classes.pessoas.repository.UsuarioRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/usuario")
public class UsuarioController extends com.base.controller.Controller<Usuario, UsuarioRepo> {
}