package com.ironhack.taskmanagement.repository;

import com.ironhack.taskmanagement.model.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {
}