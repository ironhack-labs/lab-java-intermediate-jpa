package org.example.jpa_intermediate_lab.Entities;

import jakarta.persistence.Entity;

@Entity
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(String title, java.time.LocalDate dueDate, boolean status) {
        super(title, dueDate, status);
    }
}