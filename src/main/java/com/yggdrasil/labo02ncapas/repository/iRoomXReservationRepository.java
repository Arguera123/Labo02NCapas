package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.RoomXReservation;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface iRoomXReservationRepository extends iGenericRepository<RoomXReservation, UUID> {
    public RoomXReservation save(RoomXReservation r);

    @Query("SELECT rr FROM RoomXReservation rr")
    public List<RoomXReservation> findAll();

    @Query(nativeQuery = true, value = "SELECT * FROM roomxreservation")
    public List<RoomXReservation> findAllNative();

}
