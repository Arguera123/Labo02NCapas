package com.yggdrasil.labo02ncapas.models;

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
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idBill;

    @Column
    private Date issueDate;

    @Column
    private double totalPrice;

    @OneToOne
    @JoinColumn(name = "id_reservation", nullable = false, unique = true, foreignKey = @ForeignKey(name = "FK_bill_reservation"))
    private Reservation reservation;
}
