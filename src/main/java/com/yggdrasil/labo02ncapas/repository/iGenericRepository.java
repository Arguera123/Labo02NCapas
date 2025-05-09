package com.yggdrasil.labo02ncapas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface iGenericRepository<T, UUID> extends JpaRepository<T, UUID> {
}
