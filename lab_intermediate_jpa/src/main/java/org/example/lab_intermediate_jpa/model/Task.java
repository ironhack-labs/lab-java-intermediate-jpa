package org.example.lab_intermediate_jpa.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length=50)
    private String title;
    @Column(nullable = false)
    private String dueDate;
    @Column(nullable = false)
    private boolean status;
    public Task(){}
    public Task(String title, String dueDate, boolean status){
        this.title=title;
        this.dueDate=dueDate;
        this.status=status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isStatus() {
        return status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
