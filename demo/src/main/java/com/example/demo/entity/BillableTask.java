package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="billable_tasks")
public class BillableTask extends Task{
    private Double hourlyRate;

    public BillableTask(){}

    public BillableTask(String title, LocalDate dueDate, Boolean status){
        super(title, dueDate, status);
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
