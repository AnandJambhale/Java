package com.codewithdurgesh.blog.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BankAcc {

    @NonNull
    private String accType;

    @Id
    private Integer accNum;

    private String accOpeningDate;

    @NonNull
    private String customerName;

    private String branchName;

    private String ifscCode;

    private int availableBalance;

    private String panNumber;

    private long depositAmountForFd;

    private String tenure;

    private Double rateOfInterest;

    private Double maturityAmount;

    private String openingDate;

    private String maturityDate;
}
