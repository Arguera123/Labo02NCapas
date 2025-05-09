package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.Branch;
import com.yggdrasil.labo02ncapas.models.ClientPoint;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iClientPoint extends iGenericRepository<ClientPoint, UUID> {
    public List<Branch> findByName(@Param("name") String name);

    @Query("SELECT c FROM ClientPoint c WHERE c.given_points = :givenPoints")
    public List<Branch> findByGivenPoints(@Param("givenPoints") int givenPoints);

    @Query(nativeQuery = true, value = "SELECT * FROM client_point WHERE given_points = :givenPoints")
    public List<Branch> findByGivenPointsNative(@Param("givenPoints") int givenPoints);
}
