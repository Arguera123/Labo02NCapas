package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.Shift;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iShiftRepository extends iGenericRepository<Shift, UUID> {
    public Shift save(Shift s);

    @Query("SELECT s FROM Shift s")
    public List<Shift> findAll();

    @Query(nativeQuery = true, value = "SELECT * FROM shift")
    public List<Shift> findAllNative();
}
