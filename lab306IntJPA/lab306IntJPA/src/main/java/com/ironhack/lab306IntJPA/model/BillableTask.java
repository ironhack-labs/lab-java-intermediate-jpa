package com.ironhack.lab306IntJPA.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillableTask extends Task{

    private Integer hourlyRate;


}
