package com.ironhack.lab306IntJPA.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;

    @Embedded
    // Indicates that Name is an embedded object (not a separate table)
    private Name name;

    private String title;
    private String company;
}
