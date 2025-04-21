package com.example.IntermediateJPA.modelsjoined;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "billeable_task")
@PrimaryKeyJoinColumn(name = "task_id")
public class BilleableTaskJoined extends TaskJoined {

    @Column(name = "hourly_rate")
    private BigDecimal hourlyRate;

    public BilleableTaskJoined() {
    }

    public BilleableTaskJoined(String title, String dueDate, boolean status, BigDecimal hourlyRate) {
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
