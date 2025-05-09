package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.Reservation;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iReservationRepository extends iGenericRepository<Reservation, UUID> {
    public Reservation save(Reservation reservation);

    @Query("SELECT r FROM Reservation r")
    public List<Reservation> findAll();

    @Query(nativeQuery = true, value = "SELECT * FROM reservation")
    public List<Reservation> findAllNative();
}
