package com.ironhack.labIntermediateJPA.models;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="task")

public abstract class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private int taskId;

    private String title;

    @Column(name = "due_date")
    private String dueDate;

    private boolean status;

    public Task() {}// Imprescindible constructor vacio

    public Task(String title, String dueDate, boolean status) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", title='" + title + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", status=" + status +
                '}';
    }
}

