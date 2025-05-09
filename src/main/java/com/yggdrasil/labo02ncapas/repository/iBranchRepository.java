package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.Branch;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iBranchRepository extends iGenericRepository<Branch, UUID> {
    public List<Branch> findAll();

    @Query("SELECT b FROM Branch b WHERE b.name = :name")
    public List<Branch> findByName(@Param("name") String name);

    @Query(nativeQuery = true, value = "SELECT * FROM branch WHERE name = :name")
    public List<Branch> findByNameNative(@Param("name") String name);
}
