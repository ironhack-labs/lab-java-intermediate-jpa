package com.ironhack.taskmanagement.model;


import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class BillableTask extends AppTask {
    private double hourlyRate;

    public BillableTask(Long id, String title, Date dueDate, boolean status, double hourlyRate) {
        super(id, title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public BillableTask() {

    }
}
