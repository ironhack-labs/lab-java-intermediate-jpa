package com.example.demo.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Name {

    private String firstName;

    private String lastName;

    private String middleName;
    private String salutation;
}