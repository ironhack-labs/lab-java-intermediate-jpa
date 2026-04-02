package com.ironhack.demo_lab.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "internal_tasks")
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task {
    public InternalTask() {
    }
}
