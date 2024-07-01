package Ironhack.schl.Lab3_06.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;

@Entity
public class InternalTask extends Tasks{

    public InternalTask() {
    }

    public InternalTask(Long id, String name, Date dueDate, boolean status) {
        super(id, name, dueDate, status);
    }

}
