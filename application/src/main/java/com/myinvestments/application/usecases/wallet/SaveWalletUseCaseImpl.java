package com.myinvestments.application.usecases.wallet;

import com.myinvestments.core.entities.Wallet;
import com.myinvestments.core.interfaces.repositories.wallet.WalletWriteOnlyRepository;
import com.myinvestments.core.interfaces.usecases.wallet.SaveWalletUseCase;
import com.myinvestments.core.interfaces.validations.wallet.WalletValidation;
import org.springframework.stereotype.Service;

@Service
public class SaveWalletUseCaseImpl implements SaveWalletUseCase {

    private WalletValidation walletValidation;
    private WalletWriteOnlyRepository walletWriteOnlyRepository;

    public SaveWalletUseCaseImpl(WalletValidation walletValidation, WalletWriteOnlyRepository walletWriteOnlyRepository) {
        this.walletValidation = walletValidation;
        this.walletWriteOnlyRepository = walletWriteOnlyRepository;
    }

    @Override
    public Wallet save(Wallet wallet) {
        wallet.validate(wallet, walletValidation);
        if (wallet.isValid()) {
            return walletWriteOnlyRepository.save(wallet);
        }
        return wallet;
    }
}
