package com.ironhack.labIntermediateJPA.models;

import jakarta.persistence.*;

@Entity
@Table(name="Contacts")
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // no seria necesario porque se van a llamar igual
    private int id;
    private String name;
    private String title; // aqui no uso Column por lo comentado arriba
    private String company;
    // Objeto embebido
    @Embedded
    private FullName fullName;



}
