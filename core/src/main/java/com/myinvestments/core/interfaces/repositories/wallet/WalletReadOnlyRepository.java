package com.myinvestments.core.interfaces.repositories.wallet;

import com.myinvestments.core.entities.Wallet;

import java.util.List;
import java.util.UUID;

public interface WalletReadOnlyRepository {
    Wallet findById(UUID walletId);
    List<Wallet> findAll();
}
