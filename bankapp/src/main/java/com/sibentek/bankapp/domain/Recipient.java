package com.sibentek.bankapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by william on 31/01/2018.
 */
@Data
@Entity
public class Recipient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String accountNumber;
    private String description;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private User user;
}
