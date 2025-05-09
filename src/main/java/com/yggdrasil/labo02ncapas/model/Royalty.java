package com.yggdrasil.labo02ncapas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Royalty {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idRoyalty;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private int pointsNeeded;
}
