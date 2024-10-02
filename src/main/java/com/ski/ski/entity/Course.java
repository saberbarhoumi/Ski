package com.ski.ski.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;

    private int level;

    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse; // Utilisation de l'énumération TypeCourse

    @Enumerated(EnumType.STRING)
    private Support support; // Utilisation de l'énumération Support

    private float price;
    private int timeSlot;

    @ManyToOne
    @JoinColumn(name = "numRegistration") // Colonne clé étrangère
    private Registration registration;
}
