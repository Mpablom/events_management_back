package com.event_management.project.repositories;

import com.event_management.project.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Long, Event> {
}
