package com.example.jpa_intermidiate.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Task{
    private double hourlyRate;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public BillableTask() {}

    public BillableTask(String title, LocalDate dueDate, boolean status, double hourlyRate) {
        super(title,dueDate,status);
        setHourlyRate(hourlyRate);
    }
}
