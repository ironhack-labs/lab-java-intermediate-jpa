package com.example.task.repository;

import com.example.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    @Query("SELECT t FROM Task t WHERE t.status = true")
    List<Task> findCompletedTasks();

    @Query(value = "SELECT * FROM task WHERE status = true LIMIT 5", nativeQuery = true)
    List<Task> findTop5CompletedTasksNative();
}
