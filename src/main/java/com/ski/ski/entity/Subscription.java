package com.ski.ski.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Subscription")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;

    private LocalDate startDate;
    private Float price;

    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub; // Utilisation de l'énumération TypeSubscription

    // Relation ManyToOne avec Skier
    @ManyToOne
    @JoinColumn(name = "numSkier") // Colonne clé étrangère dans Subscription
    private Skier skier; // Un abonnement appartient à un skieur
}
