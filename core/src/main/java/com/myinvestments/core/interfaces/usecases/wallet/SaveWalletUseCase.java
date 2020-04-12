package com.myinvestments.core.interfaces.usecases.wallet;

import com.myinvestments.core.entities.Wallet;

public interface SaveWalletUseCase {
    Wallet save(Wallet wallet);
}
