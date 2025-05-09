package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.ClientPoint;
import com.yggdrasil.labo02ncapas.models.Floor;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iFloorRepository extends iGenericRepository<Floor, UUID> {
    public List<ClientPoint> findByName(@Param("name") String name);

    @Query("SELECT f FROM Floor f")
    public List<Floor> findAll();

    @Query(nativeQuery = true, value = "SELECT * FROM floor")
    public List<Floor> findAllNative();
}
