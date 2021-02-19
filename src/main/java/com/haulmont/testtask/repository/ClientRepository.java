package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Client;

import java.util.UUID;

public class ClientRepository extends Repository implements IEntityRepository<Client>{

    @Override
    public Client getById(UUID ud) {
        return null;
    }

    @Override
    public void save(Client entity) {

    }
}
