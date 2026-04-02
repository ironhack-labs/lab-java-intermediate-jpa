package com.ironhack.jpa.labintermediate.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

// InternalTask and BillableTask will take fields from this entity.
@Entity
@Table(name="tasks")
// Using JOINED Inheritance strategy for this entity.
@Inheritance(strategy = InheritanceType.JOINED)
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(name = "due_date")
    private LocalDateTime dueDate;

    @Column
    private boolean status;

    public Task(){}

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

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
