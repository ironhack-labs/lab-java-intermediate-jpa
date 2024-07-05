package com.jpa.jpa.entities;


import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class BillableTask extends Task {
    private double hourlyRate;

    public BillableTask() {}

    public BillableTask(String title, Date dueDate, boolean status, double hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    // Getters and Setters
}
