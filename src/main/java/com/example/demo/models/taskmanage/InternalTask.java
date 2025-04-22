package com.example.demo.models.taskmanage;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "internal_task")
@PrimaryKeyJoinColumn(name="task_id")
public class InternalTask extends Task{
    public InternalTask(){}

    public InternalTask(String title, Date dueDate, boolean status) {
        super(title, dueDate, status);
    }
}
