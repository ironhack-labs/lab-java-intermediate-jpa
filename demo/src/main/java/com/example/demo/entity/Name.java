package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Entity
@Embeddable
public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    private String salutation;

}
