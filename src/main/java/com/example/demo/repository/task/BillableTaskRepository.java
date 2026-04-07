package com.example.demo.repository.task;

import com.example.demo.entity.task.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Repository specifically for BillableTask entities.
 * Useful when you need to work only with billable tasks (e.g., invoicing).
 */
@Repository
public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {

    /**
     * Finds all billable tasks with hourly rate greater than or equal to the given rate.
     */
    List<BillableTask> findByHourlyRateGreaterThanEqual(BigDecimal hourlyRate);

    /**
     * Finds billable tasks by title (case insensitive).
     */
    List<BillableTask> findByTitleContainingIgnoreCase(String title);
}