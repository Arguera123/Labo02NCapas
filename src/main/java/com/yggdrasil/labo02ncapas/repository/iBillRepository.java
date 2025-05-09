package com.yggdrasil.labo02ncapas.repository;

import com.yggdrasil.labo02ncapas.models.Bill;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

@Transactional
public interface iBillRepository extends iGenericRepository<Bill, UUID> {
    public Bill findByBillId(UUID billId);

    @Query("SELECT b FROM Bill b WHERE b.issueDate = :issueDate")
    public List<Bill> findByIssueDate(@Param("issueDate") String issueDate);

    @Query(nativeQuery = true, value = "SELECT * FROM bill")
    public List<Bill> findAll();
}
