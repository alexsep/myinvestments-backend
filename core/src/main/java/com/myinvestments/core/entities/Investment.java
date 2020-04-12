package com.myinvestments.core.entities;

import com.myinvestments.core.dto.NotificationDto;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class Investment extends Entity{
    private String description;
    private double amount;
    private double currentAmount;
    private Date issueDate;
    private Date dueDate;
    private Wallet wallet;

    @Builder
    public Investment(UUID id, boolean isValid, List<NotificationDto> validationResult, String description, double amount, double currentAmount, Date issueDate, Date dueDate, Wallet wallet) {
        super(id, isValid, validationResult);
        this.description = description;
        this.amount = amount;
        this.currentAmount = currentAmount;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.wallet = wallet;
    }
}
