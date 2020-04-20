package com.myinvestments.application.usecases.investment;

import com.myinvestments.core.entities.Investment;
import com.myinvestments.core.interfaces.repositories.investments.InvestmentReadOnlyRepository;
import com.myinvestments.core.interfaces.usecases.investments.FIndInvestmentUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindInvestmentUseCaseImpl implements FIndInvestmentUseCase {

    private InvestmentReadOnlyRepository investmentReadOnlyRepository;

    FindInvestmentUseCaseImpl(InvestmentReadOnlyRepository investmentReadOnlyRepository){
        this.investmentReadOnlyRepository = investmentReadOnlyRepository;
    }

    @Override
    public List<Investment> findAll() {
        return investmentReadOnlyRepository.findAll();
    }
}
