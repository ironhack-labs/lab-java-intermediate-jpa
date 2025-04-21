package com.example.IntermediateJPA.repositoriesjoined;

import com.example.IntermediateJPA.modelsjoined.TaskJoined;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskJoinedRepository extends JpaRepository<TaskJoined, Integer> {
}
