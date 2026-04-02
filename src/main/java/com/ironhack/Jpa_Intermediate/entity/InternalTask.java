package com.ironhack.Jpa_Intermediate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "internal_tasks")
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task{

}
