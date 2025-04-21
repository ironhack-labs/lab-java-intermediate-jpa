package com.example.IntermediateJPA.repositoriesjoined;

import com.example.IntermediateJPA.modelsjoined.BilleableTaskJoined;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

@SpringBootTest
public class TestTaskJoinedRepository {
    @Autowired
    private TaskJoinedRepository taskJoinedRepository;

    @Test
    @DisplayName("crear una tarea billeable joined")
    public void createBilleableTaskJoined(){

        BilleableTaskJoined billeableTaskJoined = new BilleableTaskJoined("title1", "dueDate1",
                true, new BigDecimal("100"));

        BilleableTaskJoined billeableTaskJoinedSaved = taskJoinedRepository.save(billeableTaskJoined);

        assertNotNull(billeableTaskJoinedSaved);
        System.out.println(billeableTaskJoinedSaved);

    }
}
