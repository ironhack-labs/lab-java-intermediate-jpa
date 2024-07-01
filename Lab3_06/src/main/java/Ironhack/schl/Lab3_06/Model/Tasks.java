package Ironhack.schl.Lab3_06.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date dueDate;
    private boolean status;
    // Constructors and getters/setters
    public Tasks() {
        // Default constructor
    }
    public Tasks(Long id, String title, Date dueDate, boolean status) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = false;
    }

    @Override
    public String toString()  {
        return "Tasks{" + "title=" + title + "," +
                " dueDate=" + dueDate + "," +
                " status=" + status + '}';
    }
}
