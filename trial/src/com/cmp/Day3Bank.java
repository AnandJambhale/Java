package com.cmp;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ank{
    private void addAccount(String name){
        Random r=new Random();
        int account=r.nextInt(1000000000);
        accounts.add(account);
        Money.add(new BigDecimal(50));
        System.out.println("Hello "+name+" Your account number is "+account);
    }

    int AccountNum;

    ArrayList<Integer> accounts=new ArrayList<>(Arrays.asList(33,45863258,45468452));
    ArrayList<BigDecimal> Money=new ArrayList<BigDecimal>();

    ank(){
        System.out.println("Welcome to our bank");
    }

    private void getBalance(int account) {
        int ind=accounts.indexOf(account);
        BigDecimal balance=Money.get(ind);
        System.out.println("balance is Rs "+ balance);
    }

    private void options(int command){
        Scanner sc=new Scanner(System.in);
        switch (command) {
            case 1 -> {
                System.out.println("How much money you want to add in account");
                int value = sc.nextInt();
                addMoney(new BigDecimal(value));
                bank();
            }
            case 2 -> {
                System.out.println("How much money you want to withdraw");
                int Value = sc.nextInt();
                withdrawl(AccountNum,new BigDecimal(Value));
                bank();
            }
            case 3 -> {getBalance(AccountNum);
                        bank();}
            case 4 -> {
                System.out.println("Type your name");
                String name=sc.nextLine();
                addAccount(name);
                account();
                bank();
            }
            case 5 -> {
                System.out.println("Thank you for using our service");
            }
            default -> System.out.println("Type a number between 1 and 3");
        }
    }
    private void optionsrunner(){
        Scanner c=new Scanner(System.in);
        int com=c.nextInt();
        if(1<=com && com<6){
            options(com);
        }
        else {
            System.out.println("Type a number between 1 and 5\n");
            optionsrunner();
        }
    }

    public void addMoney(BigDecimal money){
        if(money.signum()==-1){
            System.out.println("Type a positive number");
        }
        else{
            int ind = accounts.indexOf(AccountNum);
            BigDecimal mon = Money.get(ind);
            mon = mon.add(money);
            Money.add(ind, mon);
            System.out.println("Rs " + money + " has been added to account");
            System.out.println("updated balance is Rs " + Money.get(ind));
        }
    }
    private void withdrawl(int account,BigDecimal money){
        int ind=accounts.indexOf(account);
        BigDecimal balance=Money.get(ind);
        if(balance.subtract(money).signum()!=-1) {
            balance = balance.subtract(money);
            Money.add(ind,balance);
            System.out.println("Rs " + money + " has been withdrawl from account");
            System.out.println("updated balance is Rs " + balance);
        }
        else {
            System.out.println("You dont have sufficient balance in your account");
        }
    }

    public void account(){
        System.out.println("Type your account number");
        Scanner sc=new Scanner(System.in);
        AccountNum=sc.nextInt();
        bank();
    }
    public void bank(){
        Money.add(new BigDecimal(33));
        Money.add(new BigDecimal(47));
        Money.add(new BigDecimal(86));
        if(accounts.contains(AccountNum)){
            System.out.println("What you want to do");
            System.out.println("1) Add Money");
            System.out.println("2) Withdraw Money");
            System.out.println("3) Check Balance");
            System.out.println("4) Add account");
            System.out.println("5) Exit");
            System.out.println("Type number only");
            optionsrunner();
        }
        else {
            System.out.println("This account number doesnot exist. Type correct account number");
            bank();
        }
    }

}
public class Day3Bank {
    public static void main(String[] args) {
        ank jk=new ank();
        jk.account();
    }
}
