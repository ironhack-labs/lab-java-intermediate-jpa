package com.example.demo.entity.task;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import java.time.LocalDate;

/**
 * InternalTask extends Task and represents non-billable tasks.
 * Discriminator value "INTERNAL" is used in the single table.
 */
@Entity
@DiscriminatorValue("INTERNAL")
public class InternalTask extends Task {

    // Default constructor required by JPA
    public InternalTask() {
        super();
    }

    // Convenient constructor
    public InternalTask(String title, LocalDate dueDate) {
        super(title, dueDate, false);
    }
}