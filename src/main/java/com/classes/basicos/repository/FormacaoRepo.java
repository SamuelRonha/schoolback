package com.classes.basicos.repository;

import com.classes.basicos.model.Formacao;
import org.springframework.stereotype.Repository;
import com.base.repository.CustomRepo;

@Repository
public interface FormacaoRepo extends CustomRepo<Formacao, Long> {
}