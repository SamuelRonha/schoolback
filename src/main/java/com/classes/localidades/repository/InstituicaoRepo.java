package com.classes.localidades.repository;

import com.classes.localidades.model.Instituicao;
import com.base.repository.CustomRepo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Samuel on 17/06/2017.
 */
public interface InstituicaoRepo extends CustomRepo<Instituicao, Long> {
}
