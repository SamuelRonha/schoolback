package com.classes.localidades.repository;

import com.classes.localidades.model.Pais;
import com.base.repository.CustomRepo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Samuel on 17/06/2017.
 */
public interface PaisRepo extends CustomRepo<Pais, Long> {
}
