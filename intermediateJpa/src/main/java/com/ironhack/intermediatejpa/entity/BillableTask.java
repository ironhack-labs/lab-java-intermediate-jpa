package com.ironhack.intermediatejpa.entity;
import jakarta.persistence.Entity;

@Entity
public class BillableTask extends Task {

    private Double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title, java.time.LocalDate dueDate, boolean status, Double hourlyRate) {
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