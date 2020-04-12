package com.myinvestments.adapter.mappers;

import com.myinvestments.adapter.entities.InvestmentPersistence;
import com.myinvestments.core.entities.Investment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface InvestmentMapper {
    InvestmentMapper INSTANCE = Mappers.getMapper(InvestmentMapper.class);

    InvestmentPersistence map(Investment investment);

    Investment map(InvestmentPersistence investmentPersistence);

    List<Investment> map(List<InvestmentPersistence> investmentPersistenceList);

}
