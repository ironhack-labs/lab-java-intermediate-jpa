package com.example.IntermediateJPA.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("Billeable")
public class BilleableTask extends Task {

    @Column(name = "hourly_rate")
    private BigDecimal hourlyRate;

    public BilleableTask() {
    }

    public BilleableTask(String title, String dueDate, boolean status, BigDecimal hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + "hourlyRate=" + hourlyRate +
                '}';
    }
}
