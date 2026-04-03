package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="firstName",column=@Column(name="first_name")),
            @AttributeOverride(name="lastName",column=@Column(name="last_name")),
            @AttributeOverride(name="middleName",column=@Column(name="middle_name")),
            @AttributeOverride(name="salutation",column=@Column(name="salutation"))
    })
    private Name name;

    private String title;

    private String company;
    public Contact(){}
}
