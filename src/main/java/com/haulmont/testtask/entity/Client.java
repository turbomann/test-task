package com.haulmont.testtask.entity;

import org.hibernate.annotations.OptimisticLockType;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;
import javax.persistence.Entity;

@Entity
@Table(name = "CLIENTS", uniqueConstraints = {
        @UniqueConstraint(columnNames = "FIRSTNAME"),
        @UniqueConstraint(columnNames = "LASTNAME"),
        @UniqueConstraint(columnNames = "MIDDLENAME"),
        @UniqueConstraint(columnNames = "TELEPHONENUMBER"),
        @UniqueConstraint(columnNames = "CLIENTEMAIL") })
        @UniqueConstraint(columnNames = "CLIENTPASSPORTN") })

public class Client implements Serializable {

    public Client() {
    }
    @Column(name = "FIRSTNAME", unique = false, nullable = false, length = 100)
    private String firstName;

    @Column(name = "LASTNAME", unique = false, nullable = false, length = 100)
    private String lastName;

    @Column(name = "MIDDLENAME", unique = false, nullable = false, length = 100)
    private String middleName;

    @Column(name = "TELEPHONENUMBER", unique = true, nullable = false, length = 100)
    private String telephoneNumber;

    @Column(name = "CLIENTEMAIL", unique = true, nullable = false, length = 100)
    private String clientEmail;

    @Column(name = "CLIENTPASSPORTN", unique = false, nullable = false, length = 100)
    private String clientPassportN;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPassportN() {
        return clientPassportN;
    }

    public void setClientPassportN(String clientPassportN) {
        this.clientPassportN = clientPassportN;
    }


}
