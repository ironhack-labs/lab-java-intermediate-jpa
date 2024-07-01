package Ironhack.schl.Lab3_06.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;
@Entity
public class BillableTask extends Tasks{
    private double hourlyRate;

    public BillableTask() {

    }
    public BillableTask(Long id, String name, Date dueDate, boolean status, double hourlyRate) {
        super(id, name, dueDate, status);
        this.hourlyRate = hourlyRate;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}
