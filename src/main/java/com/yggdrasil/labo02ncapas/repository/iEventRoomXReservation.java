package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.EventRoom;
import com.yggdrasil.labo02ncapas.models.EventRoomXReservation;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iEventRoomXReservation extends iGenericRepository<EventRoom, UUID> {
    public EventRoom save(EventRoom eventRoom);

    @Query("SELECT r FROM EventRoomXReservation r WHERE r.eventRoom = :eventRoom")
    public List<EventRoom> findByEventRoom(EventRoom eventRoom);

    @Query(nativeQuery = true, value = "SELECT * FROM event_roomxreservation")
    public List<EventRoomXReservation> findByEventRoomxreservation();
}
