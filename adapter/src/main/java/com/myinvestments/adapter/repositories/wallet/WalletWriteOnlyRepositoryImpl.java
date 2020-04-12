package com.myinvestments.adapter.repositories.wallet;

import com.myinvestments.adapter.entities.WalletPersistence;
import com.myinvestments.adapter.mappers.InvestmentMapper;
import com.myinvestments.adapter.mappers.WalletMapper;
import com.myinvestments.core.entities.Wallet;
import com.myinvestments.core.interfaces.repositories.wallet.WalletWriteOnlyRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WalletWriteOnlyRepositoryImpl implements WalletWriteOnlyRepository {

    private WalletPersistenceRepository walletPersistenceRepository;

    public WalletWriteOnlyRepositoryImpl(WalletPersistenceRepository walletPersistenceRepository) {
        this.walletPersistenceRepository = walletPersistenceRepository;
    }

    @Override
    public Wallet save(Wallet wallet) {
        WalletPersistence walletPersistence = walletPersistenceRepository.save(WalletMapper.INSTANCE.map(wallet));
        wallet.setId(walletPersistence.getId());
        wallet.setInvestments(InvestmentMapper.INSTANCE.map(walletPersistence.getInvestments()));
        return wallet;
    }

    @Override
    public Wallet update(Wallet wallet) {
        return null;
    }

    @Override
    public void delete(UUID walletId) {

    }
}
