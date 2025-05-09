package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.Room;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface iRoomRepository extends iGenericRepository<Room, UUID> {
    public Room findByName(String name);

    @Query("SELECT r FROM Room r")
    public List<Room> findAll();

    @Query(nativeQuery = true, value = "SELECT * FROM room")
    public List<Room> findAllNative();
}
