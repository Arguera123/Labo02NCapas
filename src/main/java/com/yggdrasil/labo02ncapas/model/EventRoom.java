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
public class EventRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEventRoom;

    @Column
    private String name;

    @Column
    private int capacity;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false, foreignKey = @ForeignKey(name = "FK_event_room_branch"))
    private Branch branch;
}
