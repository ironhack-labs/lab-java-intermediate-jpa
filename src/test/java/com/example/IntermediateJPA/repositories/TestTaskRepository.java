package com.example.IntermediateJPA.repositories;

import com.example.IntermediateJPA.models.BilleableTask;
import com.example.IntermediateJPA.models.InternalTask;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

@SpringBootTest
public class TestTaskRepository {
    @Autowired
    private TaskRepository taskRepository;

    @Test
    @DisplayName("Crea una BilleableTask")
    public void createBilleableTask(){
        BilleableTask billeableTask = new BilleableTask("titulo1", "date1", true, new BigDecimal("100"));

        BilleableTask saved = taskRepository.save(billeableTask);

        assertNotNull(saved);

        System.out.println(saved);
    }

    @Test
    @DisplayName("Crea una InternalTask")
    public void createInternalTask(){
        InternalTask internalTask = new InternalTask("titulo2", "date2", true);

        InternalTask saved = taskRepository.save(internalTask);

        assertNotNull(saved);

        System.out.println(saved);
    }
}
