package com.myinvestments.adapter.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
@Entity(name = "wallet")
public class WalletPersistence {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid_generator")
    @Type(type = "uuid-char")
    private UUID id;
    private String description;
    private BigDecimal totalAmount;
    private BigDecimal amountInvested;
    @OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL)
    private List<InvestmentPersistence> investments;
}
