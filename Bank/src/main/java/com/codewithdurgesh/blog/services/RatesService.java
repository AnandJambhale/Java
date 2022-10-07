package com.codewithdurgesh.blog.services;

import com.codewithdurgesh.blog.entities.InterestRates;
import com.codewithdurgesh.blog.repositories.InterestRatesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatesService {

    @Autowired
    private InterestRatesRepo interestRatesRepo;

    public void addInterestRates(InterestRates interestRates){
        this.interestRatesRepo.save(interestRates);
    }
}
