package com.sibentek.bankapp.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by william on 31/01/2018.
 */
@Data
@Entity
@NoArgsConstructor
public class SavingsTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate date;
    private String description;
    private String type;
    private String status;
    private Double amount;
    private BigDecimal availableBalance;

    @ManyToOne
    @JoinColumn(name = "savings_account_id")
    private SavingsAccount savingsAccount;

    public SavingsTransaction(LocalDate date,
                              String description,
                              String type,
                              String status,
                              Double amount,
                              BigDecimal availableBalance,
                              SavingsAccount savingsAccount) {
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.availableBalance = availableBalance;
        this.savingsAccount = savingsAccount;
    }
}
