package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Credit;

import java.util.UUID;

public class CreditRepository extends Repository implements IEntityRepository<Credit> {
    @Override
    public Credit getById(UUID ud) {
        return null;
    }

    @Override
    public void save(Credit entity) {

    }
}
