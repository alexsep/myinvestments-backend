package com.myinvestments.adapter.repositories.investment;

import com.myinvestments.adapter.entities.InvestmentPersistence;
import com.myinvestments.adapter.mappers.InvestmentMapper;
import com.myinvestments.core.entities.Investment;
import com.myinvestments.core.interfaces.repositories.investments.InvestmentWriteOnlyRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class InvestmentWriteOnlyRepositoryImpl implements InvestmentWriteOnlyRepository {

    private InvestmentPersistenceRepository investmentPersistenceRepository;

    public InvestmentWriteOnlyRepositoryImpl(InvestmentPersistenceRepository investmentPersistenceRepository) {
        this.investmentPersistenceRepository = investmentPersistenceRepository;
    }

    @Override
    @Transactional
    public Investment save(Investment investment) {
        InvestmentPersistence investmentPersistence = investmentPersistenceRepository.save(InvestmentMapper.INSTANCE.map(investment));
        investment.setId(investmentPersistence.getId());
        return investment;
    }

    @Override
    public Investment update(Investment investment) {
        return null;
    }

    @Override
    public void delete(UUID investmentId) {

    }
}
