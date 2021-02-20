package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.Clients;

import java.util.UUID;

public class ClientRepository implements IEntityReposotory<Clients>{


    @Override
    public Clients getById(UUID id) {
        return null;
    }

    @Override
    public void save(Clients entity) {

    }
}
