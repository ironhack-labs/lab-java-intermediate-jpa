package org.example.jpa.entity;

import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Name name;

    private String title;
    private String company;
}
