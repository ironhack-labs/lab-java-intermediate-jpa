package com.example.demo.entity.contact;

import jakarta.persistence.*;

/**
 * Contact entity for the PR company.
 * Name is embedded (not a separate entity/table) as required.
 */
@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Name name;

    @Column(length = 150)
    private String title;      // Job title, e.g. "Marketing Director"

    @Column(length = 200)
    private String company;

    // Default constructor required by JPA
    public Contact() {
    }

    // Convenient constructor
    public Contact(Name name, String title, String company) {
        this.name = name;
        this.title = title;
        this.company = company;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}