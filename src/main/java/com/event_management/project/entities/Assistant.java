package com.event_management.project.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Assistants")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Assistant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
}