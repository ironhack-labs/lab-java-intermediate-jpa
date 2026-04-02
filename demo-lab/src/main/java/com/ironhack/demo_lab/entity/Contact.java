package com.ironhack.demo_lab.entity;


import jakarta.persistence.*;
import jdk.jfr.ContentType;
import org.hibernate.annotations.JoinColumnOrFormula;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Name name;

    @Column(length = 50)
    private String title;

    @Column(length = 100)
    private String company;

    public Contact() {
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
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
}
