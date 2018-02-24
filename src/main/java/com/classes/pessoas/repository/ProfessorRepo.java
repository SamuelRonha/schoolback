package com.classes.pessoas.repository;

import com.classes.pessoas.model.Professor;
import com.base.repository.CustomRepo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Samuel on 17/06/2017.
 */
public interface ProfessorRepo extends CustomRepo<Professor, Long> {
}
