package com.example.task.entity;

import jakarta.persistence.Entity;

@Entity
public class BillableTask extends Task {

    private double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(Long id, String title, java.time.LocalDate dueDate, boolean status, double hourlyRate) {
        super(id, title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
