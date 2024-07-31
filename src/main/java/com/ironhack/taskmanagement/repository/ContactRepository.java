package com.ironhack.taskmanagement.repository;

import com.ironhack.taskmanagement.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
