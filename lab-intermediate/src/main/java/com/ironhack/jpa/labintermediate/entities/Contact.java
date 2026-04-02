package com.ironhack.jpa.labintermediate.entities;

import jakarta.persistence.*;

// Creating contacts table which takes fields from Embeddable class Name.
@Entity
@Table(name = "contacts")
public class Contact{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String title;
    @Column(length = 50, nullable = false)
    private String company;
//  Using fields from embeddable class Name and rename them.
    @AttributeOverrides({
        @AttributeOverride(name="firstName", column = @Column(name = "first_name")),
        @AttributeOverride(name="lastName", column = @Column(name = "last_Name")),
        @AttributeOverride(name="middleName", column = @Column(name = "middle_name")),
        @AttributeOverride(name="salutation", column = @Column(name = "salutation")),
    })
    @Embedded
    private Name name;

    public Contact() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
