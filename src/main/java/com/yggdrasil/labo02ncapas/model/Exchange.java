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
public class Exchange {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idExchange;

    @ManyToOne
    @JoinColumn(name = "royalty_id", nullable = false, foreignKey = @ForeignKey(name = "FK_exchange_royalty"))
    private Royalty royalty;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "FK_exchange_user"))
    private User user;
}
