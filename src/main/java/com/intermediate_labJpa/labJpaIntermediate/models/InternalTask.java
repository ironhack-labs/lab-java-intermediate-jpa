package com.intermediate_labJpa.labJpaIntermediate.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("InternalTask")
public class InternalTask extends Task {


}
