package com.event_management.project.repositories;

import com.event_management.project.entities.Assistant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssistantRepository extends JpaRepository<Long, Assistant> {
}
