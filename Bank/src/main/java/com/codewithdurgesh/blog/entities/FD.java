package com.codewithdurgesh.blog.entities;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class FD {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NonNull
    private String name;

    @NonNull
    private long depositAmount;

    @NonNull
    private long maturityAmount;

    @NonNull
    private Integer probationPeriod;

    private String depositDate;

    private String maturityDate;
}
