package com.ironhack.jpa.labintermediate.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

// No addition fields by task.
// Fields will be taken from Task entity.
@Entity
@Table(name = "internal_tasks")
public class InternalTask extends Task{
    public InternalTask(){}
}
