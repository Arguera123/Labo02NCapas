package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.Royalty;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iRoyaltiyRepository extends iGenericRepository<Royalty, UUID> {
    public Royalty save(Royalty r);

    @Query("SELECT r FROM Royalty r")
    public List<Royalty> findAll();

    @Query(nativeQuery = true, value = "SELECT * FROM royalty")
    public List<Royalty> findAllNative();
}
