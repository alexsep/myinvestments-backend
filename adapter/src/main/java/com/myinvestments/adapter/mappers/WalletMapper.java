package com.myinvestments.adapter.mappers;

import com.myinvestments.adapter.entities.WalletPersistence;
import com.myinvestments.core.entities.Wallet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface WalletMapper {

    WalletMapper INSTANCE = Mappers.getMapper(WalletMapper.class);

    WalletPersistence map(Wallet wallet);

    Wallet map(WalletPersistence walletPersistence);

    List<Wallet> map(List<WalletPersistence> walletPersistenceList);


}
