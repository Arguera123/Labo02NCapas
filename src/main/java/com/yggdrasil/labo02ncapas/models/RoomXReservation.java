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
public class RoomXReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idRoomReservation;

    @ManyToOne
    @JoinColumn(name = "reservation_id", nullable = false, foreignKey = @ForeignKey(name = "FK__room_reservation_reservation"))
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "event_room_id", nullable = false, foreignKey = @ForeignKey(name = "FK_room_reservation_room"))
    private Room room;
}
