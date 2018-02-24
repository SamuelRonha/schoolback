package com.classes.basicos.repository;

import com.base.repository.CustomRepo;
import com.classes.basicos.model.RequisicaoAluno;
import org.springframework.stereotype.Repository;
import com.base.repository.CustomRepo;

@Repository
public interface RequisicaoAlunoRepo extends CustomRepo<RequisicaoAluno, Long> {
}