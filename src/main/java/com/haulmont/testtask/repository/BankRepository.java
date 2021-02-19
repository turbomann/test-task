package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Bank;

import java.util.UUID;

public class BankRepository extends Repository implements IEntityRepository<Bank>{

    @Override
    public Bank getById(UUID ud) {
        return null;
    }

    @Override
    public void save(Bank entity) {

    }
}
