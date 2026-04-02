package com.example.demo.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
public class Contacts {

    @Embedded
    private Name name;
    
    private String title;
    private String company;

}
