package com.myinvestments.application.usecases;

import com.myinvestments.core.entities.Investment;
import com.myinvestments.core.interfaces.repositories.investments.InvestmentWriteOnlyRepository;
import com.myinvestments.core.interfaces.usecases.investments.SaveInvestmentUseCase;
import com.myinvestments.core.interfaces.validations.investment.InvestmentValidation;
import org.springframework.stereotype.Service;

@Service
public class SaveInvestmentUseCaseImpl implements SaveInvestmentUseCase {

    private InvestmentValidation investmentValidation;
    private InvestmentWriteOnlyRepository investmentWriteOnlyRepository;

    public SaveInvestmentUseCaseImpl(InvestmentValidation investmentValidation, InvestmentWriteOnlyRepository investmentWriteOnlyRepository) {
        this.investmentValidation = investmentValidation;
        this.investmentWriteOnlyRepository = investmentWriteOnlyRepository;
    }

    @Override
    public Investment save(Investment investment) {
        boolean isValid = investment.validate(investment, investmentValidation);
        if (isValid) {
            return investmentWriteOnlyRepository.save(investment);
        }
        return investment;
    }
}
