package com.classes.pessoas.controller;

import com.classes.pessoas.model.Aluno;
import com.classes.pessoas.model.QAluno;
import com.classes.pessoas.repository.AlunoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@CrossOrigin("*")
@RequestMapping("/aluno")
public class AlunoController extends com.base.controller.Controller<Aluno, AlunoRepo> {

    @Autowired
    AlunoRepo alunoRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable,
                               @RequestParam(value = "nome", required = false) String nome,
                               @RequestParam(value = "numero", required = false) String numero
    ) {
        if (nome != null || numero != null) {
            Page<Aluno> p = new PageImpl<Aluno>(alunoRepo.query().select(
                    QAluno.aluno
            ).from(QAluno.aluno).
                    where(QAluno.aluno.pessoa.nome.likeIgnoreCase("%" + nome + "%").or(QAluno.aluno.numero.likeIgnoreCase("%" + numero + "%"))).
                    limit(pageable.getPageSize()).offset(pageable.getOffset()).
                    fetch());
            return new ResponseEntity(p, HttpStatus.OK);
        } else
            return getAll(pageable, null);

    }

}