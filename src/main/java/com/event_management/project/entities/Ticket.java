package com.event_management.project.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Tickets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long eventId;
    private Long assistantId;
    private Integer quantity;
    private String state;
}
