package com.ironhack.labIntermediateJPA.models;


import jakarta.persistence.*;


/*
De momento esto no esta mapeado a la BBDD
Probando sólo a usar dos tablas esta es igual que la superclase Task
 */
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="internal_task")

public class InternalTask extends Task{
    // para que tenga al menos un atributo y se cree la entidad
    // Es lo que se llama atributo dummi
    //Si no JPA da problemas con inheritance strategy JOINED
    //Esto en el caso que quisieramos las tres tablas
    //Esta tabla no va a persistir teniendo sólo dos
    // private String taskCategory;

    public InternalTask() {
    }

    public InternalTask(String title, String dueDate, boolean status) {
        super(title, dueDate, status);
    }



}

