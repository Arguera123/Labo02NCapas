package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface iUserRepository extends iGenericRepository<User, UUID> {
    public User findByUsername(String username);

    @Query("SELECT u FROM User u WHERE U.name = :name")
    public User findByName(@Param("name") String name);

    @Query(nativeQuery = true, value = "SELECT * FROM user_data WHERE firts_name = :firstname")
    public User findByFirstname(@Param("firstname") String firstname);
}
