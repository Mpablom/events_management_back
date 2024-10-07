package com.event_management.project.repositories;

import com.event_management.project.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Long, Ticket> {
}
