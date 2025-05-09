package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.Rol;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface iRolRepository extends iGenericRepository<Rol, UUID> {
    public Rol findOne(UUID id);

    @Query("SELECT r FROM Rol r")
    public List<Rol> findAll();

    @Query(nativeQuery = true, value = "SELECT * FROM rol")
    public List<Rol> findAllNative();
}
