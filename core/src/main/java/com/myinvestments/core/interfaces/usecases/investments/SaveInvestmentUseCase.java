package com.myinvestments.core.interfaces.usecases.investments;

import com.myinvestments.core.entities.Investment;

public interface SaveInvestmentUseCase {
    Investment save(Investment investment);
}
