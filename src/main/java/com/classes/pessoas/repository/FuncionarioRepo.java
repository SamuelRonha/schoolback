package com.classes.pessoas.repository;

import com.classes.pessoas.model.Funcionario;
import com.base.repository.CustomRepo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Samuel on 17/06/2017.
 */
public interface FuncionarioRepo extends CustomRepo<Funcionario, Long> {
}
