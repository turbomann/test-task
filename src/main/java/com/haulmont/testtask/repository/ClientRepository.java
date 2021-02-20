package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Client;

import java.util.UUID;

public class ClientRepository implements IEntityReposotory<Client>{


    @Override
    public Client getById(UUID id) {
        return null;
    }

    @Override
    public void save(Client entity) {

    }
}
