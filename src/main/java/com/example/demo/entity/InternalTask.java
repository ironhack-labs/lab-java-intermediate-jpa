package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "internal_tasks")
public class InternalTask extends Task{
    public InternalTask() {}
    public InternalTask(UUID id, Date dueDate, boolean status) {
        super(id, dueDate, status);
    }
}
