package com.ironhack.taskmanagement.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Name {

    private String firstName;
    private String lastName;
    private String middleName;
    private String salutation;

    public Name(String firstName, String lastName, String middleName, String salutation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salutation = salutation;
    }

    public Name() {

    }

}