package Ironhack.schl.Lab3_06.repository;

import Ironhack.schl.Lab3_06.Model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts, String> {
}
