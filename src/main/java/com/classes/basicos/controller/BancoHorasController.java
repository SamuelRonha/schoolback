package com.classes.basicos.controller;

import com.classes.basicos.model.BancoHoras;
import com.classes.basicos.model.QBancoHoras;
import com.classes.basicos.repository.BancoHorasRepo;
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
@RequestMapping("/banco-horas")
public class BancoHorasController extends com.base.controller.Controller<BancoHoras, BancoHorasRepo> {

    BancoHorasRepo bancoHorasRepo;

    @GetMapping("/find")
    @PreAuthorize("hasAuthority('EMPLOYEE') or hasAuthority('ADMIN')")
    public ResponseEntity find(Pageable pageable, @RequestParam(
            value = "funcionario.pessoa.nome",
            name = "nome"
    ) String nome) {
        QBancoHoras bh = QBancoHoras.bancoHoras;
        Page<BancoHoras> b = new PageImpl<>(bancoHorasRepo.query().select(
                bh
        ).from(bh).where(bh.funcionario.pessoa.nome.like("%" + nome + "%")).
                limit(pageable.getPageSize()).offset(pageable.getOffset()).fetch());
        return new ResponseEntity(b, HttpStatus.FOUND);
    }

}
