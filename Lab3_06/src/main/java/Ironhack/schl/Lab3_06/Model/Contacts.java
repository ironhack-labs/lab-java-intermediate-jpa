package Ironhack.schl.Lab3_06.Model;

import jakarta.persistence.*;

@Entity
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String title;
    private String company;
    @Embedded
    private Names names;
    // Constructors
    public Contacts() {
        // Default constructor
    }
    public Contacts(Long id, String name, String title, String company) {
        this.id= id;
        this.name = name;
        this.title = title;
        this.company = company;
    }
    // Getters and Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contacts{" + "name=" + name + "," +
                " title=" + title + "," +
                " company=" + company + '}';
    }

}

