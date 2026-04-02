package com.example.task.entity;

import jakarta.persistence.Entity;

@Entity
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(Long id, String title, java.time.LocalDate dueDate, boolean status) {
        super(id, title, dueDate, status);
    }
}
