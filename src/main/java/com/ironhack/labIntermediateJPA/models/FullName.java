package com.ironhack.labIntermediateJPA.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class FullName {
    private String fistName;
    private String lastName;
    private String middleName;
    private String salutation;

    public FullName() {}

    public FullName(String fistName, String lastName, String middleName, String salutation) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salutation = salutation;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
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

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", salutation='" + salutation + '\'' +
                '}';
    }
}
