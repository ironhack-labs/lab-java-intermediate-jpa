package com.ironhack.lab306IntJPA.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    private String salutation;

}
