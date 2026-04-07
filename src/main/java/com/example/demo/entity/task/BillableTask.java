package com.example.demo.entity.task;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * BillableTask extends Task and adds hourlyRate field.
 * Discriminator value "BILLABLE" is used to distinguish it in the single table.
 */
@Entity
@DiscriminatorValue("BILLABLE")
public class BillableTask extends Task {

    @Column(name = "hourly_rate", precision = 10, scale = 2, nullable = false)
    private BigDecimal hourlyRate;

    // Default constructor required by JPA
    public BillableTask() {
        super();
    }

    // Convenient constructor
    public BillableTask(String title, LocalDate dueDate, BigDecimal hourlyRate) {
        super(title, dueDate, false);
        this.hourlyRate = hourlyRate;
    }

    // Getters and Setters
    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}