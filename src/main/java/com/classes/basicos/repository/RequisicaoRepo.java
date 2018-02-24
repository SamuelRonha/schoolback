package com.classes.basicos.repository;

import com.classes.basicos.model.Requisicao;
import org.springframework.stereotype.Repository;
import com.base.repository.CustomRepo;

@Repository
public interface RequisicaoRepo extends CustomRepo<Requisicao, Long> {
}