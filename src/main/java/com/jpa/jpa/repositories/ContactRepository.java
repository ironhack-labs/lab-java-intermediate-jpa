package com.jpa.jpa.repositories;


import com.jpa.jpa.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
