package com.example.demo.repository.contact;

import com.example.demo.entity.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for Contact entities in the PR company.
 * Provides standard CRUD operations plus custom queries for contacts.
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    /**
     * Finds contacts by company name (case insensitive).
     */
    List<Contact> findByCompanyContainingIgnoreCase(String company);

    /**
     * Finds contacts whose job title contains the given text.
     */
    List<Contact> findByTitleContainingIgnoreCase(String title);

    /**
     * Finds contacts by last name (case insensitive) using the embedded Name object.
     */
    List<Contact> findByNameLastNameContainingIgnoreCase(String lastName);

    /**
     * Finds all contacts from a specific company and with a specific job title.
     */
    List<Contact> findByCompanyAndTitleContainingIgnoreCase(String company, String title);
}