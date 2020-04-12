package com.myinvestments.adapter.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "investment")
public class InvestmentPersistence {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid_generator")
    @Type(type = "uuid-char")
    private UUID id;
    private String description;
    private double amount;
    private double currentAmount;
    private Date issueDate;
    private Date dueDate;
    @ManyToOne
    private WalletPersistence wallet;
}
