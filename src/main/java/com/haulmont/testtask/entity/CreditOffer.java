package com.haulmont.testtask.entity;

import javax.persistence.*;

public class CreditOffer extends Entity{
   private int creditSum;

   @JoinColumn (name = "CLIENT_ID", nullable = false)
   @ManyToOne
   private Client client;

   @JoinColumn(name = "BANK_ID")
   @ManyToOne
    private Bank bank;








}
