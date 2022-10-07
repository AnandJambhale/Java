package com.codewithdurgesh.blog.services;

import com.codewithdurgesh.blog.entities.BankAcc;
import com.codewithdurgesh.blog.entities.FD;
import com.codewithdurgesh.blog.entities.InterestRates;
import com.codewithdurgesh.blog.repositories.BankRepo;
import com.codewithdurgesh.blog.repositories.InterestRatesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.*;

@Service
public class BankServices {

    @Autowired
    private BankRepo bankRepo;

    @Autowired
    private InterestRatesRepo interestRatesRepo;

    public BankAcc addAcc(BankAcc bankAcc){
        Random random=new Random();
        int accNum= random.nextInt(1000000);
        bankAcc.setAccNum(accNum);
        return this.bankRepo.save(bankAcc);
    }

    public List<BankAcc> getAllAcc(){
        return this.bankRepo.findAll();
    }

    public BankAcc getAccount(int id){
        BankAcc bankAcc=this.bankRepo.findById(id).orElseThrow(()->new RuntimeException());
//        if (bankAcc.getDepositAmountForFd()>=10000){
//            bankAcc.setMaturityAmount(bankAcc.getDepositAmountForFd()+(bankAcc.getDepositAmountForFd()*bankAcc.getTenure()* bankAcc.getRateOfInterest())/100);
//        }
        return bankRepo.save(bankAcc);
    }

    public  BankAcc setFd(Integer accNum, FD fd){
        BankAcc bankAcc=this.bankRepo.findById(accNum).orElseThrow(()->new RuntimeException());

        List<InterestRates> interestRates=this.interestRatesRepo.findAll();

        for (int i=0;i<interestRates.size(); i++){
            if (fd.getProbationPeriod()>=interestRates.get(i).getDayOne() && fd.getProbationPeriod()<=interestRates.get(i).getLastDay()){
                bankAcc.setRateOfInterest(interestRates.get(i).getRate());

                int years = fd.getProbationPeriod()/365;
                int months = fd.getProbationPeriod()%365/30;
                int days = fd.getProbationPeriod()%365%30;
                bankAcc.setTenure(years+" years "+months+" months "+days+" days");

                Locale locale=new Locale("en","IN");
                DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
                String date= dateFormat.format(new Date());
                bankAcc.setOpeningDate(date);

                Calendar calendar=Calendar.getInstance();
                calendar.add(Calendar.DATE,+fd.getProbationPeriod());
                Date afterProbationPeriod=calendar.getTime();
                String dateAfterProbationPeriod=dateFormat.format(afterProbationPeriod);
                bankAcc.setMaturityDate(dateAfterProbationPeriod);

                bankAcc.setDepositAmountForFd(fd.getDepositAmount());
            }
        }
        this.bankRepo.save(bankAcc);
        return bankAcc;
    }

    public BankAcc setRate(Integer accNum, Integer days){
        BankAcc bankAcc=this.bankRepo.findById(accNum).orElseThrow(()->new RuntimeException());

        List<InterestRates> interestRates=this.interestRatesRepo.findAll();

        InterestRates interestRates1=interestRates.stream().filter(day->day.getLastDay()>=days && day.getDayOne()<=days).findFirst().get();
        bankAcc.setRateOfInterest(interestRates1.getRate());

        this.bankRepo.save(bankAcc);
        return bankAcc;
    }

    public BankAcc getByAccNum(Integer accNum){
        return this.bankRepo.findByAccNum(accNum);
    }
}
