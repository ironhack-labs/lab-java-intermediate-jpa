package com.ironhack.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "contacts")
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String compamy;

    @Embedded
    private Name names;

    public Contacts(){}

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

    public String getCompamy() {
        return compamy;
    }

    public void setCompamy(String compamy) {
        this.compamy = compamy;
    }

    public Name getNames() {
        return names;
    }

    public void setNames(Name names) {
        this.names = names;
    }
}
