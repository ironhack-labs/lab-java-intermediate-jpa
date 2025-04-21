package com.example.IntermediateJPA.repositories;

import com.example.IntermediateJPA.models.BilleableTask;
import com.example.IntermediateJPA.models.Contact;
import com.example.IntermediateJPA.models.InternalTask;
import com.example.IntermediateJPA.models.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

@SpringBootTest
public class TestContactRepository {
    @Autowired
    private ContactRepository contactRepository;

    @Test
    @DisplayName("crear un Contact")
    public void testCreateContact() {

        Contact contact = new Contact("title1", "company1",
                new Name("Juan", "Martinez", "Lopez", "Hola mundo"));

        Contact contactSaved = contactRepository.save(contact);

        assertNotNull(contactSaved);
        System.out.println(contactSaved);
    }
}
