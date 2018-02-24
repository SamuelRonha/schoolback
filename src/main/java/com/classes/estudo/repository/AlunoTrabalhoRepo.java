package com.classes.estudo.repository;

import com.classes.estudo.model.AlunoTrabalho;
import com.base.repository.CustomRepo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Samuel on 17/06/2017.
 */
public interface AlunoTrabalhoRepo extends CustomRepo<AlunoTrabalho, Long> {
}
