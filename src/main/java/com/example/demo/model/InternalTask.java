package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Tasks {
    public InternalTask(){}
    public InternalTask(String title, LocalDate due, boolean status) {
        super(title, due, status);
    }
}
