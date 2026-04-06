package org.ironhack.mapping.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "internal_tasks")
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task{

    public InternalTask() {}

}
