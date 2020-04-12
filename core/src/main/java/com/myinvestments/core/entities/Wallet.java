package com.myinvestments.core.entities;

import com.myinvestments.core.dto.NotificationDto;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
public class Wallet extends Entity {
    private String description;
    private BigDecimal totalAmount;
    private BigDecimal amountInvested;
    private List<Investment> investments;

    @Builder
    public Wallet(UUID id, boolean isValid, List<NotificationDto> validationResult, String description, BigDecimal totalAmount, BigDecimal amountInvested, List<Investment> investments) {
        super(id, isValid, validationResult);
        this.description = description;
        this.totalAmount = totalAmount;
        this.amountInvested = amountInvested;
        this.investments = investments;
    }
}
