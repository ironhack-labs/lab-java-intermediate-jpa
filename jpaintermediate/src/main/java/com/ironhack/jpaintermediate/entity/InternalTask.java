package com.ironhack.jpaintermediate.entity;

import com.ironhack.jpaintermediate.entity.Task;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "internal_tasks")
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(String title, java.time.LocalDate dueDate, boolean status) {
        super(title, dueDate, status);
    }
}