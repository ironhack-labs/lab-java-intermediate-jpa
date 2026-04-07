package com.example.demo.entity.contact;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * Embeddable value object for person's name.
 * This class is embedded directly into the Contact entity.
 * No separate table is created for Name (as per requirements).
 */
@Embeddable
public class Name {

    @Column(name = "salutation", length = 20)
    private String salutation;

    @Column(name = "first_name", length = 100, nullable = false)
    private String firstName;

    @Column(name = "middle_name", length = 100)
    private String middleName;

    @Column(name = "last_name", length = 100, nullable = false)
    private String lastName;

    // Default constructor required by JPA
    public Name() {
    }

    // Convenient constructor
    public Name(String salutation, String firstName, String middleName, String lastName) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    /**
     * Returns the full name in a readable format.
     * Example: "Mr. John Michael Smith"
     */
    public String getFullName() {
        StringBuilder sb = new StringBuilder();
        if (salutation != null && !salutation.isEmpty()) {
            sb.append(salutation).append(" ");
        }
        sb.append(firstName).append(" ");
        if (middleName != null && !middleName.isEmpty()) {
            sb.append(middleName).append(" ");
        }
        sb.append(lastName);
        return sb.toString().trim();
    }

    // Getters and Setters
    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}