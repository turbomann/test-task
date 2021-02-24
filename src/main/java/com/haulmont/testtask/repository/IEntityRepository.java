package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Entity;

import java.util.UUID;

public interface IEntityRepository<T extends Entity>  {
    //методы с hibertane

    T getById(UUID id);
    void save(T entity);
}
