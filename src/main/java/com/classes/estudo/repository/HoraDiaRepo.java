package com.classes.estudo.repository;

import com.classes.estudo.model.HoraDia;
import com.base.repository.CustomRepo;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * Created by Samuel on 17/06/2017.
 */
public interface HoraDiaRepo extends CustomRepo<HoraDia, Long> {
}
