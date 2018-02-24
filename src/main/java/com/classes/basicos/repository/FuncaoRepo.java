package com.classes.basicos.repository;

import com.base.repository.CustomRepo;
import com.classes.basicos.model.Funcao;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoRepo extends CustomRepo<Funcao, Long> {
}