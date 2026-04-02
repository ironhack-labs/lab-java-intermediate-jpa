package org.ironhack.collections.lab.entity;

import jakarta.persistence.Entity;

@Entity
public class BillableTask extends Task {
    private Double hourlyRate;
}
