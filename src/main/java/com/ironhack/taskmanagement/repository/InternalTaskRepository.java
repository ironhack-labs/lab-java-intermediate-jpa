package com.ironhack.taskmanagement.repository;

import com.ironhack.taskmanagement.model.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {
}