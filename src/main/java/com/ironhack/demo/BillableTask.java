package com.ironhack.demo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class BillableTask extends Task {
    private BigDecimal hourlyRate;

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
