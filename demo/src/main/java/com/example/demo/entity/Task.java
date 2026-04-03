package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate dueDate;
    private Boolean status;

    public Task(){}

    public Task( String title, LocalDate dueDate, Boolean status) {

        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
