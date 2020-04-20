package com.myinvestments.core.interfaces.usecases.wallet;

import com.myinvestments.core.entities.Wallet;

import java.util.List;

public interface FindWalletUseCase {
    List<Wallet> findAll();
}
