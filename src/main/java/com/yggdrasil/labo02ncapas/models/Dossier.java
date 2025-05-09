package com.yggdrasil.labo02ncapas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idDossier;

    @Column
    private String description;

    @Column
    private Date date;

    @Column
    private Time time;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false, foreignKey = @ForeignKey(name = "FK_dossier_room"))
    private Room room;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "FK_dossier_user"))
    private User user;
}
