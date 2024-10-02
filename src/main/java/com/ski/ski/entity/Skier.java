package com.ski.ski.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Skier")
public class Skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;

    @OneToMany(mappedBy = "skier", cascade = CascadeType.ALL) // Ajoutez cascade si nécessaire
    private List<Registration> registrations; // Liste des enregistrements pour ce skieur
    @OneToMany(mappedBy = "skier")
    private List<Subscription> subscriptions; // Liste des abonnements pour ce skieur

    public void setRegistrations(List<Registration> registrations) {
        this.registrations= registrations; // Implémentation de la méthode
    }
}
