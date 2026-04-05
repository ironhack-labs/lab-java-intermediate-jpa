package org.example.lab_intermediate_jpa.model;

import jakarta.persistence.*;

@Entity
@Table(name="contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length=50)
    private String title;
    @Column(nullable = false,length=50)
    private String company;
    @Embedded
    private FullName fullName;
    public Contact(){}
    public Contact( String title, String company, FullName fullName){
        this.title=title;
        this.company=company;
        this.fullName=fullName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }
}
