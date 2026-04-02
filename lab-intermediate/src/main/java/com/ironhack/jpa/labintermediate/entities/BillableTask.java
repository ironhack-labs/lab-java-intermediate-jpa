package com.ironhack.jpa.labintermediate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="billable_tasks")
public class BillableTask extends Task{
    @Column(name = "hourly_rate")
    private Double hourlyRate;

    public BillableTask() {
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
