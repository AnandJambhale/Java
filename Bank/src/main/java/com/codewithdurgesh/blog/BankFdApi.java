package com.codewithdurgesh.blog;

import com.codewithdurgesh.blog.entities.AccountTypes;
import com.codewithdurgesh.blog.entities.InterestRates;
import com.codewithdurgesh.blog.services.AccountTypesService;
import com.codewithdurgesh.blog.services.RatesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankFdApi implements CommandLineRunner {

	@Autowired
	private RatesService ratesService;

	@Autowired
	private AccountTypesService accountTypesService;

	public static void main(String[] args) {
		SpringApplication.run(BankFdApi.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
		InterestRates interest=new InterestRates(7,14,4.0,10000);
		InterestRates interest1=new InterestRates(15,29,4.00,10000);
		InterestRates interest2=new InterestRates(30,45,4.75,10000);
		InterestRates interest3=new InterestRates(46,90,5.25,10000);
		InterestRates interest4=new InterestRates(91,180,5.25,10000);
		InterestRates interest5=new InterestRates(181,270,5.65,10000);
		InterestRates interest6=new InterestRates(271,365,5.90,10000);
		InterestRates interest7=new InterestRates(366,730,6.15,10000);
		InterestRates interest8=new InterestRates(731,1095,6.25,10000);
		InterestRates interest9=new InterestRates(1096,3650,6.15,10000);

		ratesService.addInterestRates(interest);
		ratesService.addInterestRates(interest1);
		ratesService.addInterestRates(interest2);
		ratesService.addInterestRates(interest3);
		ratesService.addInterestRates(interest4);
		ratesService.addInterestRates(interest5);
		ratesService.addInterestRates(interest6);
		ratesService.addInterestRates(interest7);
		ratesService.addInterestRates(interest8);
		ratesService.addInterestRates(interest9);

		AccountTypes accountTypes=new AccountTypes(1,"Saving Account");
		AccountTypes accountTypes1=new AccountTypes(2,"Current Account");
		AccountTypes accountTypes2=new AccountTypes(3,"Salary Account");
		AccountTypes accountTypes3=new AccountTypes(4,"NRI Account");
		AccountTypes accountTypes4=new AccountTypes(5,"Recurring Deposit Account");
		AccountTypes accountTypes5=new AccountTypes(6,"Fixed Deposit Account");
		this.accountTypesService.addAccountTypes(accountTypes);
		this.accountTypesService.addAccountTypes(accountTypes1);
		this.accountTypesService.addAccountTypes(accountTypes2);
		this.accountTypesService.addAccountTypes(accountTypes3);
		this.accountTypesService.addAccountTypes(accountTypes4);
		this.accountTypesService.addAccountTypes(accountTypes5);

	}
}
