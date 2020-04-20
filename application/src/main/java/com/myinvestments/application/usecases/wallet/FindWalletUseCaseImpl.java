package com.myinvestments.application.usecases.wallet;

import com.myinvestments.core.entities.Wallet;
import com.myinvestments.core.interfaces.repositories.wallet.WalletReadOnlyRepository;
import com.myinvestments.core.interfaces.usecases.wallet.FindWalletUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindWalletUseCaseImpl implements FindWalletUseCase {

    private WalletReadOnlyRepository walletReadOnlyRepository;

    FindWalletUseCaseImpl(WalletReadOnlyRepository walletReadOnlyRepository){
        this.walletReadOnlyRepository = walletReadOnlyRepository;
    }

    @Override
    public List<Wallet> findAll() {
        return walletReadOnlyRepository.findAll();
    }
}
