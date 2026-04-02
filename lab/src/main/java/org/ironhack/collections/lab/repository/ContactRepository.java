package org.ironhack.collections.lab.repository;

import org.ironhack.collections.lab.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // Buraya da əlavə kod yazmağa ehtiyac yoxdur, JpaRepository kifayətdir.
}