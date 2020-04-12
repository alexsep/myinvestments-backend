package com.myinvestments.core.interfaces.repositories.investments;

import com.myinvestments.core.entities.Investment;

import java.util.UUID;

public interface InvestmentWriteOnlyRepository {
    Investment save(Investment investment);
    Investment update(Investment investment);
    void delete(UUID investmentId);
}
