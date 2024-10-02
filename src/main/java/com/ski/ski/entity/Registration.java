package com.ski.ski.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numRegistration;

    private int numWeek;

    @ManyToOne
    @JoinColumn(name ="numSkier") // Colonne clé étrangère pour Skier
    private Skier skier;
}