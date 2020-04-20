package com.myinvestments.core.interfaces.usecases.investments;

import com.myinvestments.core.entities.Investment;

import java.util.List;

public interface FIndInvestmentUseCase {
    List<Investment> findAll();
}
