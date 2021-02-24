package com.haulmont.testtask.entity;

import org.hibernate.annotations.OptimisticLockType;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;

//@Entity
//@Table(name = "CLIENTS" {
//        (columnNames = "FIRSTNAME"),
//        (columnNames = "LASTNAME"),
//        (columnNames = "MIDDLENAME"),
//        (columnNames = "TELEPHONENUMBER"),
//        (columnNames = "CLIENTEMAIL") })
//        @UniqueConstraint(columnNames = "CLIENTPASSPORTN") })

public class Client extends Entity implements Serializable {

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
