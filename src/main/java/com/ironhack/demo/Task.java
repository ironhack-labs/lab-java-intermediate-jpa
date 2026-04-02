package com.ironhack.demo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDate dueDate;
    private boolean status;


}
