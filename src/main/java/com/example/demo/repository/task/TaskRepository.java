package com.example.demo.repository.task;

import com.example.demo.entity.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * Main repository for the Task hierarchy.
 * Since we use SINGLE_TABLE inheritance, we can query both BillableTask
 * and InternalTask through this repository.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Finds all tasks that are not yet completed and due before the given date.
     */
    List<Task> findByCompletedFalseAndDueDateBefore(LocalDate date);

    /**
     * Finds all tasks with a specific title (case insensitive).
     */
    List<Task> findByTitleContainingIgnoreCase(String title);

    /**
     * Counts how many tasks are still pending (not completed).
     */
    long countByCompletedFalse();
}