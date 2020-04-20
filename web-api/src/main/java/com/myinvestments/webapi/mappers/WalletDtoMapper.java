package com.myinvestments.webapi.mappers;

import com.myinvestments.core.entities.Wallet;
import com.myinvestments.webapi.dto.WalletDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface WalletDtoMapper {
    WalletDtoMapper INSTANCE = Mappers.getMapper(WalletDtoMapper.class);

    WalletDto map(Wallet wallet);

    Wallet map(WalletDto walletDto);

    List<Wallet> map(List<WalletDto> walletDtoList);
    List<WalletDto> mapToDtoList(List<Wallet> walletList);
}
