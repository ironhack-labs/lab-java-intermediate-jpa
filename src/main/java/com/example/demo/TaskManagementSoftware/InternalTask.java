package com.example.demo.TaskManagementSoftware;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("internal")
public class InternalTask extends Task {
}
