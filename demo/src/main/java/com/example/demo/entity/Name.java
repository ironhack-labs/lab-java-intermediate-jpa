package com.example.demo.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    private String salutation;

    public Name(String salutation, String middlename, String lastname, String firstname) {
        this.salutation = salutation;
        this.middleName = middlename;
        this.lastName = lastname;
        this.firstName = firstname;
    }
    public Name(){}

    public String getFirstname() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public String getMiddlename() {
        return middleName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public void setMiddlename(String middlename) {
        this.middleName = middlename;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
