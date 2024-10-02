package com.ski.ski.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Piste")
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String namePiste;

    @MapKeyEnumerated(EnumType.STRING)
    private Color color;
    private int length;
    private int slope;

}
