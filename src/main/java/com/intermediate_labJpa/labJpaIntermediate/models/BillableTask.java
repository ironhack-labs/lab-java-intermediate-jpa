package com.intermediate_labJpa.labJpaIntermediate.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("BillableTask")
public class BillableTask extends Task {
    private BigDecimal hourlyRate;

    public BillableTask() {
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
