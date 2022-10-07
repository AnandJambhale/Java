package com.codewithdurgesh.blog.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InterestRates {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer dayOne;
    private Integer lastDay;
    private Double rate;
    private Integer openingBalance;

    public InterestRates(Integer dayOne, Integer lastDay, Double rate, Integer openingBalance) {
        this.dayOne = dayOne;
        this.lastDay = lastDay;
        this.rate = rate;
        this.openingBalance = openingBalance;
    }
}
