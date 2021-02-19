package com.haulmont.testtask.repository;

import com.haulmont.testtask.entity.CreditOffer;

import java.util.UUID;

public class CreditOfferRepository extends Repository implements IEntityRepository<CreditOffer> {
    @Override
    public CreditOffer getById(UUID ud) {
        return null;
    }

    @Override
    public void save(CreditOffer entity) {

    }
}
