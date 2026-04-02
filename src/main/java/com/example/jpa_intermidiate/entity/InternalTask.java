package com.example.jpa_intermidiate.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task {
    public InternalTask() {}

    public InternalTask(String title, LocalDate dueDate, boolean status) {
        super(title,dueDate,status);
    }
}
