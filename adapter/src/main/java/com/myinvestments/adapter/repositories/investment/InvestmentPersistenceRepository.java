package com.myinvestments.adapter.repositories.investment;

import com.myinvestments.adapter.entities.InvestmentPersistence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InvestmentPersistenceRepository extends JpaRepository<InvestmentPersistence, UUID> {
}
