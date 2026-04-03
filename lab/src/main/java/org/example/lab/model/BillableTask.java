package org.example.lab.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "billable_task")
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Task{
    @Column(nullable = false)
    private int hourlyRate;
}
