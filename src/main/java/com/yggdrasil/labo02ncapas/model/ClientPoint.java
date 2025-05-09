package com.yggdrasil.labo02ncapas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idClientPoint;

    @Column
    private int given_points;

    @Column
    private Date last_update;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private User employee;
}