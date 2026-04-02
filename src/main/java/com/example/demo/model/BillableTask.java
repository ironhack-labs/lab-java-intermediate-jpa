package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Tasks {
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    private double hourlyRate;

    public BillableTask(){}
    public BillableTask(String title, LocalDate due, boolean status, double hourlyRate) {
        super(title, due, status);
        this.hourlyRate = hourlyRate;
    }
}
