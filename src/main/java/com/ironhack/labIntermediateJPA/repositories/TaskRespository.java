package com.ironhack.labIntermediateJPA.repositories;

import com.ironhack.labIntermediateJPA.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRespository extends JpaRepository <Task, Integer> {
}
