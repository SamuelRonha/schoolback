package com.classes.pessoas.repository;

import com.classes.pessoas.model.Aluno;
import com.base.repository.CustomRepo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Samuel on 17/06/2017.
 */
public interface AlunoRepo extends CustomRepo<Aluno, Long> {
}
