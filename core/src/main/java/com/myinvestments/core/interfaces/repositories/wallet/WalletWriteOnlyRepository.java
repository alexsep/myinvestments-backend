package com.myinvestments.core.interfaces.repositories.wallet;

import com.myinvestments.core.entities.Wallet;

import java.util.UUID;

public interface WalletWriteOnlyRepository {
    Wallet save(Wallet wallet);
    Wallet update(Wallet wallet);
    void delete(UUID walletId);
}
