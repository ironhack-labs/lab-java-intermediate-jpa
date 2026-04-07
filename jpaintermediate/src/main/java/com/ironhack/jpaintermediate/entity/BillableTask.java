package com.ironhack.jpaintermediate.entity;

import com.ironhack.jpaintermediate.entity.Task;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "billable_tasks")
public class BillableTask extends Task {

    @Column(nullable = false)
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