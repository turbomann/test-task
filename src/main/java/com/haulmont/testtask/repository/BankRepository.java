package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Bank;

import java.util.UUID;

public class BankRepository extends Repository implements IEntityReposotory<Bank> {

    @Override
    public Bank getById(UUID id) {
        return null;
    }

    @Override
    public void save(Bank entity) {

    }
}
