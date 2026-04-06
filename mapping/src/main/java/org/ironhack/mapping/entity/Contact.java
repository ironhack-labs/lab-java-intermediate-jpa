package org.ironhack.mapping.entity;

import jakarta.persistence.*;
import org.ironhack.mapping.object.Name;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @AttributeOverrides({
            @AttributeOverride(name = "firstName",column = @Column(name = "contact_first_name")),
            @AttributeOverride(name = "lastName",column = @Column(name = "contact_last_name")),
            @AttributeOverride(name = "middleName",column = @Column(name = "contact_middle_name")),
            @AttributeOverride(name = "salutation",column = @Column(name = "contact_salutation"))
    })

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String company;

    @Embedded
    private Name name;

    public Contact() {}

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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
