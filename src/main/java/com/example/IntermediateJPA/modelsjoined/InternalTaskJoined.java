package com.example.IntermediateJPA.modelsjoined;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "internal_task")
@PrimaryKeyJoinColumn(name = "task_id")
public class InternalTaskJoined extends TaskJoined{

    public InternalTaskJoined() {
    }

    public InternalTaskJoined(String title, String dueDate, boolean status) {
        super(title, dueDate, status);
    }

    @Override
    public String toString() {
        return super.toString()+"}";
    }
}
