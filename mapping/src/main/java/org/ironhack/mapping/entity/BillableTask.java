package org.ironhack.mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "billable_tasks")
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Task {

    @Column( nullable = false, name = "hourly_rate")
    private Double hourlyRate;

    public BillableTask() {}

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
