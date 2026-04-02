package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @AttributeOverrides({
            @AttributeOverride(name = "firstName",column = @Column(name = "contact_firstName")),
            @AttributeOverride(name="lastName",column = @Column(name = "contact_lastName")),
            @AttributeOverride(name="middleName",column = @Column(name = "contact_middleName")),
            @AttributeOverride(name = "salutation",column = @Column(name = "contact_salutation"))
    })
    @Embedded
    private Name name;

    private String title;
    private String company;
}
