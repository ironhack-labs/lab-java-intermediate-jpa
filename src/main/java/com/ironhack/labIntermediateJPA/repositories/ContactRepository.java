package com.ironhack.labIntermediateJPA.repositories;

import com.ironhack.labIntermediateJPA.models.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contacts, Integer> {

}
