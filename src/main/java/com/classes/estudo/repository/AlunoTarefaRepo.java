package com.classes.estudo.repository;

import com.classes.estudo.model.AlunoTarefa;
import org.springframework.stereotype.Repository;
import com.base.repository.CustomRepo;

@Repository
public interface AlunoTarefaRepo extends CustomRepo<AlunoTarefa, Long> {
}