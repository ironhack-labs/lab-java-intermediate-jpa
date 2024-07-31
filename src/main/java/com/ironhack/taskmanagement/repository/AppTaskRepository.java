package com.ironhack.taskmanagement.repository;

import com.ironhack.taskmanagement.model.AppTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppTaskRepository extends JpaRepository<AppTask, Long> {
}
