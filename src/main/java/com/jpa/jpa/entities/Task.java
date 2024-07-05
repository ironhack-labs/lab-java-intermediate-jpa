package com.jpa.jpa.entities;


import jakarta.persistence.*;
import org.hibernate.boot.model.source.spi.InheritanceType;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Date dueDate;
    private boolean status;

    public Task() {}

    public Task(String title, Date dueDate, boolean status) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }

    // Getters and Setters
}
