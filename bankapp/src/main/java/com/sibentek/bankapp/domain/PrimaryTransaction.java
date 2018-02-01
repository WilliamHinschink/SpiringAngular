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
public class PrimaryTransaction {

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
    @JoinColumn(name = "primary_account_id")
    private PrimaryAccount primaryAccount;

    public PrimaryTransaction(LocalDate date,
                              String description,
                              String type,
                              String status,
                              Double amount,
                              BigDecimal availableBalance,
                              PrimaryAccount primaryAccount) {
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.availableBalance = availableBalance;
        this.primaryAccount = primaryAccount;
    }
}
