package com.ironhack.intermediatejpa.entity;
import jakarta.persistence.Entity;

@Entity
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(String title, java.time.LocalDate dueDate, boolean status) {
        super(title, dueDate, status);
    }
}
