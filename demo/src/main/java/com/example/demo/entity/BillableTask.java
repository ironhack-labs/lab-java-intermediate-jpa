package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class BillableTask extends Task{

    private Double hourlyRate;

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    

}
