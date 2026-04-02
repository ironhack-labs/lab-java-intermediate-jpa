package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    private LocalDate due;
    private boolean status;

    public Tasks(){}
    public Tasks(String title, LocalDate due, boolean status) {
        this.title = title;
        this.due = due;
        this.status = status;
    }

    public LocalDate getDue() {
        return due;
    }

    public void setDue(LocalDate due) {
        this.due = due;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
