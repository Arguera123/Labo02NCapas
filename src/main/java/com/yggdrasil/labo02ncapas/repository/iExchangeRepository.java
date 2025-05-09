package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.Exchange;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

@Transactional
public interface iExchangeRepository extends iGenericRepository<Exchange, UUID> {
    public Exchange findByName(String name);

    @Query("SELECT e FROM Exchange e")
    public Exchange getExchanges();

    @Query(nativeQuery = true, value = "SELECT * FROM exchange")
    public Exchange getExchangesNative();
}
