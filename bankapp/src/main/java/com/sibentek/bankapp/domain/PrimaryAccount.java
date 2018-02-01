package com.sibentek.bankapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by william on 31/01/2018.
 */
@Data
@Entity
public class PrimaryAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer accountNumber;
    private BigDecimal accountBalance;

    @JsonIgnore
    @OneToMany(mappedBy = "primaryAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PrimaryTransaction> primaryTransactionList;
}
