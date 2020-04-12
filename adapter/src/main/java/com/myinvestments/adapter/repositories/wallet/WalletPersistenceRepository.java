package com.myinvestments.adapter.repositories.wallet;

import com.myinvestments.adapter.entities.WalletPersistence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WalletPersistenceRepository extends JpaRepository<WalletPersistence, UUID> {
}
