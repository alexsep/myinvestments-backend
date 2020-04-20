package com.myinvestments.adapter.repositories.investment;

import com.myinvestments.adapter.mappers.InvestmentMapper;
import com.myinvestments.core.entities.Investment;
import com.myinvestments.core.interfaces.repositories.investments.InvestmentReadOnlyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class InvestmentReadOnlyRepositoryImpl implements InvestmentReadOnlyRepository {

    private InvestmentPersistenceRepository investmentPersistenceRepository;

    InvestmentReadOnlyRepositoryImpl(InvestmentPersistenceRepository investmentPersistenceRepository){
        this.investmentPersistenceRepository = investmentPersistenceRepository;
    }

    @Override
    public Investment findById(UUID investmentId) {
        return null;
    }

    @Override
    public List<Investment> findAll() {
        return InvestmentMapper.INSTANCE.map(investmentPersistenceRepository.findAll());
    }
}
