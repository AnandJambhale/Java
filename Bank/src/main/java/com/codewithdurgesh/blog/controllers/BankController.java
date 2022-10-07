package com.codewithdurgesh.blog.controllers;

import com.codewithdurgesh.blog.entities.BankAcc;
import com.codewithdurgesh.blog.entities.FD;
import com.codewithdurgesh.blog.services.BankServices;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@Controller
public class BankController {

    @Autowired
    private BankServices bankServices;

    @MutationMapping
    public BankAcc addAcc(@Argument BankAccInp bankAcc) {
        BankAcc bankAcc1=new BankAcc();
        bankAcc1.setAccNum(bankAcc1.getAccNum());
        bankAcc1.setAccType(bankAcc.getAccType());
        bankAcc1.setBranchName(bankAcc.getBranchName());
        bankAcc1.setCustomerName(bankAcc.getCustomerName());
        bankAcc1.setIfscCode("CBI258");
        bankAcc1.setPanNumber(bankAcc.getPanNumber());
        bankAcc1.setAvailableBalance(bankAcc.getAvailableBalance());
        return this.bankServices.addAcc(bankAcc1);
    }

    @QueryMapping
    public List<BankAcc> getAllAcc(){
        return this.bankServices.getAllAcc();
    }

    @QueryMapping
    public BankAcc single(@Argument int id){
        return this.bankServices.getAccount(id);
    }

    @MutationMapping
    public BankAcc setFd(@Argument Integer accNum, @Argument FDInp fd){
        FD fd1=new FD();
        fd1.setDepositAmount(fd.getDepositAmount());
        fd1.setName(fd.getName());
        fd1.setMaturityAmount(fd.getMaturityAmount());
        fd1.setProbationPeriod(fd.getProbationPeriod());
        return this.bankServices.setFd(accNum,fd1);
    }

    @MutationMapping
    public BankAcc setRate(@Argument Integer accNum, @Argument Integer days){
        return this.bankServices.setRate(accNum,days);
    }

    @QueryMapping
    public BankAcc getByAccNum(@Argument Integer accNum){
        return this.bankServices.getByAccNum(accNum);
    }
}

@Getter
@Setter
class BankAccInp{
    private String accType;
    private String customerName;
    private String branchName;
    private int availableBalance;
    private String panNumber;
}
@Getter
@Setter
class FDInp{
    private String name;
    private long depositAmount;
    private long maturityAmount;
    private Integer probationPeriod;
}
