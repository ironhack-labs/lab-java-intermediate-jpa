package org.example.lab_intermediate_jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="billable_id")
@Table(name="billable_task")
public class BillableTask extends Task {
    private Integer hourlyRate;
    public BillableTask(){
        super();
    }
    public BillableTask(String title, String dueDate, Boolean status,Integer hourlyRate){
        super(title, dueDate, status);
        this.hourlyRate=hourlyRate;
    }

    public Integer getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Integer hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
