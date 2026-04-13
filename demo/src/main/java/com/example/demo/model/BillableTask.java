package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class BillableTask extends Task {

    private double hourlyRate;
}