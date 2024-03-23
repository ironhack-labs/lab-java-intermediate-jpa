package com.example.demo.TaskManagementSoftware;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("billable")
public class BillableTask extends Task {
    private double hourlyRate;
}

