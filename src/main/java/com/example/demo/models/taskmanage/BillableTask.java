package com.example.demo.models.taskmanage;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "billable_task")
@PrimaryKeyJoinColumn(name="task_id")
public class BillableTask extends Task{
    private int hourlyRate;

    public BillableTask(){

    }

    public BillableTask(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public BillableTask(String title, Date dueDate, boolean status, int hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "BillableTask{" +
                "hourlyRate=" + hourlyRate +
                '}';
    }
}
