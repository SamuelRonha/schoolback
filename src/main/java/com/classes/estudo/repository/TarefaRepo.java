package com.classes.estudo.repository;

import com.classes.estudo.model.Tarefa;
import com.base.repository.CustomRepo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Samuel on 17/06/2017.
 */
public interface TarefaRepo extends CustomRepo<Tarefa, Long> {
}
