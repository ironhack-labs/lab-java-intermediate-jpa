package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "billable_tasks")
public class BillableTask extends Task {
    private Double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title, Date dueDate, boolean status, Double hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
