package com.ironhack.demo_lab.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "billing_tasks")
@PrimaryKeyJoinColumn(name = "id")
public class BillingTask extends Task {

    @Column
    private Integer hourlyRate;

    public BillingTask() {
    }

    public Integer getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Integer hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
