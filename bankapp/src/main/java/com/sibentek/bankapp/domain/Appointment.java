package com.sibentek.bankapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by william on 31/01/2018.
 */
@Data
@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate date;
    private String location;
    private String description;
    private Boolean confirmed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
