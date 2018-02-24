package com.classes.basicos.repository;

import com.base.repository.CustomRepo;
import com.classes.basicos.model.BancoHoras;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepo extends CustomRepo<BancoHoras, Long> {
    @Query("select t from BancoHoras t")
    @Override
    Object relatorio();
}