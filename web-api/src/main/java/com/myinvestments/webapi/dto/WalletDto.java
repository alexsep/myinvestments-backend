package com.myinvestments.webapi.dto;

import com.myinvestments.adapter.entities.InvestmentPersistence;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WalletDto {
    private UUID id;
    private String description;
    private BigDecimal totalAmount;
    private BigDecimal amountInvested;
    private List<InvestmentPersistence> investments;
}
