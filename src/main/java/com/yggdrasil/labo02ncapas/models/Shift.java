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
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idShift;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private Time startTime;

    @Column
    private Time endTime;

    @Column
    private String state;

    @ManyToOne
    @JoinColumn(name = "floor_id", nullable = false, foreignKey = @ForeignKey(name = "FK_shift_floor"))
    private Floor floor;
}
