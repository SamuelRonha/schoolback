package com.classes.localidades.repository;

import com.classes.localidades.model.Estado;
import com.base.repository.CustomRepo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Samuel on 17/06/2017.
 */
public interface EstadoRepo extends CustomRepo<Estado, Long> {
}
