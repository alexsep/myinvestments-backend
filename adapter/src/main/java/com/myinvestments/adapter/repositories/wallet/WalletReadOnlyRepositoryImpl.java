package com.myinvestments.adapter.repositories.wallet;

import com.myinvestments.adapter.mappers.WalletMapper;
import com.myinvestments.core.entities.Wallet;
import com.myinvestments.core.interfaces.repositories.wallet.WalletReadOnlyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class WalletReadOnlyRepositoryImpl implements WalletReadOnlyRepository {

    private WalletPersistenceRepository walletPersistenceRepository;

    WalletReadOnlyRepositoryImpl(WalletPersistenceRepository walletPersistenceRepository){
        this.walletPersistenceRepository = walletPersistenceRepository;
    }

    @Override
    public Wallet findById(UUID walletId) {
        return null;
    }

    @Override
    public List<Wallet> findAll() {
        return WalletMapper.INSTANCE.map(walletPersistenceRepository.findAll());
    }
}
