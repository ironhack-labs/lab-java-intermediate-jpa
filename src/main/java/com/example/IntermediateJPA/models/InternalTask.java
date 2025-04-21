package com.example.IntermediateJPA.models;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Internal")
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(String title, String dueDate, boolean status) {
        super(title, dueDate, status);
    }

    @Override
    public String toString() {
        return super.toString()+"}";
    }
}
