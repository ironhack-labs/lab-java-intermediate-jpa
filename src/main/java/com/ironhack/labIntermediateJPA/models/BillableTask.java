package com.ironhack.labIntermediateJPA.models;


import jakarta.persistence.*;

@Entity
@Table(name="billable_task")

/*
strategy especifica cómo JPA mapeará la jerarquía de clases a las tablas de la base
JOINED: estrategia que indica que cada clase en la jerarquí (padre e hijas) tendrán
        su propia tabla en la BBDD
 */
// ***Inheritance sólo ubicado en la Superclase***
//@Inheritance(strategy = InheritanceType.JOINED)
//@PrimaryKeyJoinColumn(name="task_id" ) //Esta columna es la clave primaria
// de la subclase, y además, apunta a la clave primaria de la superclase
//No necesario ya que estamos con estrategia de herencia JOINED

public class BillableTask extends Task {
    @Column(name = "hourly_rate")
    private int hourlyRate;


    public BillableTask() {

    }

    public BillableTask(String title, String dueDate, boolean status, int hourlyRate) {
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
        return "BillableTask{" +
                "hourlyRate=" + hourlyRate +
                '}';
    }
}

