package com.ironhack.labjavaintermediatejpa.entity.task;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "internal_task")
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task {

}
