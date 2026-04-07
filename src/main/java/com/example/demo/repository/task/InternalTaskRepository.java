package com.example.demo.repository.task;

import com.example.demo.entity.task.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * Repository specifically for InternalTask entities.
 * Useful when separating internal (non-billable) operations.
 */
@Repository
public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {

    /**
     * Finds all internal tasks due before the specified date.
     */
    List<InternalTask> findByDueDateBefore(LocalDate date);

    /**
     * Finds internal tasks by title (case insensitive).
     */
    List<InternalTask> findByTitleContainingIgnoreCase(String title);
}