package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="internal_tasks")
public class InternalTask extends Task{
    public InternalTask(String title, LocalDate dueDate, Boolean status){
        super(title, dueDate, status);
    }
    public InternalTask(){}
}
