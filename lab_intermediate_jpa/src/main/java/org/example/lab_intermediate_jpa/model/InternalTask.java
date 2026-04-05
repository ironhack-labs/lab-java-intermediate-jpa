package org.example.lab_intermediate_jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="internal_task")
@PrimaryKeyJoinColumn(name="internal_id")
public class InternalTask extends Task {
    public InternalTask(){
        super();
   }
    public InternalTask(String title, String dueDate, boolean status){
        super(title, dueDate, status);
    }
}
