package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.CollectionId;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "billable_tasks")
public class BillableTask extends Task{
    @Column(nullable = false)
    private Long hourlyRate;

    public BillableTask() {}
    public BillableTask(UUID id, Date dueDate, boolean status, Long hourlyRate) {
        super(id, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public Long getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Long hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
