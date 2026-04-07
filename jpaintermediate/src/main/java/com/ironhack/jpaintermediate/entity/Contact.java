package com.ironhack.jpaintermediate.entity;


import com.ironhack.jpaintermediate.object.Name;
import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Name name;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String company;

    public Contact() {
    }

    public Contact(Name name, String title, String company) {
        this.name = name;
        this.title = title;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}