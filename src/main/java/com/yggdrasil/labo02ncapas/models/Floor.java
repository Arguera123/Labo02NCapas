package com.yggdrasil.labo02ncapas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Floor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idFloor;

    @Column
    private String name;

    @Column
    private String colorButton;

    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false, foreignKey = @ForeignKey(name = "FK_floor_branch"))
    private Branch branch;
}
