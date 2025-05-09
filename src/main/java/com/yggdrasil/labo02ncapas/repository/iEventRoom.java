package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.EventRoom;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iEventRoom extends iGenericRepository<EventRoom, UUID> {
    public EventRoom save(EventRoom eventRoom);

    @Query("SELECT er FROM EventRoom er WHERE er.name = :name")
    public EventRoom findByName(String name);

    @Query(nativeQuery = true, value = "SELECT * FROM event_room WHERE name = :name")
    public EventRoom findByNameNative(String name);
}
