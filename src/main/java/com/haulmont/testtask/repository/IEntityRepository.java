package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Entity;

import java.util.UUID;

public interface IEntityRepository<T extends Entity> {
    // здесь хранятся методы Hibernate

    T getById(UUID ud);

    void save(T entity);

}
