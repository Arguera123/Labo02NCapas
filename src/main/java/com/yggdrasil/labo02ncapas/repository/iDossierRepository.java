package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.Dossier;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

@Transactional
public interface iDossierRepository extends iGenericRepository<Dossier, UUID> {
    public Dossier save(Dossier dossier);

    @Query("SELECT d FROM Dossier d WHERE d.date = :date")
    public List<Dossier> findByDate(@Param("date") Date date);

    @Query(nativeQuery = true, value = "SELECT * FROM dossier WHERE data = :date")
    public List<Dossier> findByDateNative(@Param("date") Date date);
}
