package com.myinvestments.core.interfaces.repositories.investments;

import com.myinvestments.core.entities.Investment;

import java.util.List;
import java.util.UUID;

public interface InvestmentReadOnlyRepository {
    Investment findById(UUID investmentId);
    List<Investment> findAll();
}
