package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "internal_tasks")
public class InternalTask extends Task {
    public InternalTask() {
    }

    public InternalTask(String title, Date dueDate, boolean status) {
        super(title, dueDate, status);
    }
}
