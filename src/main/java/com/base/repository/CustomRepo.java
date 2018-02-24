package com.base.repository;

import com.base.model.Model;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface CustomRepo<T extends Model, ID extends Serializable> extends JpaRepository<T, ID> {
    default Object relatorio() {
        return "sem relatório";
    }

    JPAQuery<T> query();


}