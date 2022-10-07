package com.codewithdurgesh.blog.services;

import com.codewithdurgesh.blog.entities.AccountTypes;
import com.codewithdurgesh.blog.repositories.AccountTypesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountTypesService {

    @Autowired
    private AccountTypesRepo accountTypesRepo;

    public void addAccountTypes(AccountTypes accountTypes){
        this.accountTypesRepo.save(accountTypes);
    }
}
