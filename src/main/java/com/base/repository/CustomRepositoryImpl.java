package com.base.repository;

import com.base.model.Model;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import java.io.Serializable;

@NoRepositoryBean
public class CustomRepositoryImpl<T extends Model, ID extends Serializable> extends SimpleJpaRepository<T, ID>
        implements CustomRepo<T, ID> {

    private EntityManager entityManager;


    public CustomRepositoryImpl(JpaEntityInformation entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public JPAQuery<T> query() {
        return new JPAQuery<>(entityManager);
    }
}
