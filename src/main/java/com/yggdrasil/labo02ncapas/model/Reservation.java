package com.yggdrasil.labo02ncapas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idReservation;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private String state; // Ej: "activa", "cancelada"

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "FK_reservation_user"))
    private User user;
}
