package com.cmp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class bamk{
    public bamk(){
        System.out.println("Welcome to our bank");
    }
    void addAccount(String Name) throws IOException {
        Random r=new Random();
        int AccountNum= r.nextInt(1000000000);
        File file=new File(AccountNum+"Transactions.txt");
        file.createNewFile();

        FileWriter writer=new FileWriter(AccountNum+"Transactions"+".txt");
        writer.write("+50");
        writer.close();


        System.out.println("Welcome "+Name+" your account number is "+AccountNum);

    }
    void addMoney(int AccountNum, int Money) throws IOException {
        Path pathFileToRead= Paths.get(AccountNum+"Transactions.txt");

        FileWriter writer=new FileWriter(AccountNum+"Transactions.txt",true);
        writer.write("+"+Money+"\n");
        writer.close();

        List lines= Files.readAllLines(pathFileToRead);

        System.out.println(lines);

        int sum=0;
        for (int i=0;i<lines.size();i++) {
            sum = sum + Integer.parseInt((String) lines.get(i));
        }
        System.out.println(lines.get(0));
        System.out.println(Money+" has been added to you account. Updated balance is "+sum);
    }

    void withDrawMoney(int Money, int AccountNum) throws IOException {
        Path pathFileToRead= Paths.get(AccountNum+"Transactions.txt");

        FileWriter writer=new FileWriter(AccountNum+"Transactions.txt",true);
        writer.write("-"+Money+"\n");
        writer.close();

        List lines= Files.readAllLines(pathFileToRead);

        System.out.println(lines);

        int sum=0;
        for (int i=0;i<lines.size();i++) {
            sum = sum + Integer.parseInt((String) lines.get(i));
        }
        System.out.println(sum);
    }

    void showBalance(int Accountnum) throws IOException {
        Path pathFileToRead=Paths.get(Accountnum+"Transactions.txt");

        List lines=Files.readAllLines(pathFileToRead);
        int sum=0;
        for(int i=0;i<lines.size();i++){
            sum=sum+Integer.parseInt((String) lines.get(i));
        }
        System.out.println("Your account balance is "+sum);
    }

    void bankRunner() throws IOException {
        System.out.println("type 1 to add account or type your account number to see other options");
        Scanner sc=new Scanner(System.in);
        int accountNum=sc.nextInt();
        if(accountNum==1){
            System.out.println("What's your name?");
            Scanner nj=new Scanner(System.in);
            String name=nj.nextLine();
            addAccount(name);
        }

        File tmpDir = new File(accountNum+"Transactions.txt");
        boolean exists = tmpDir.exists();

        if(exists){
            System.out.println("What you want to do?\n"+"1) Add Money\n"+"2) Withdraw money\n"+"3) Check Balance\n"+"4) Add account\n"+"5) Exit");
            int input=sc.nextInt();
            switch (input){
                case 1 -> {
                    System.out.println("How much money you wan to add");
                    int money=sc.nextInt();
                    addMoney(accountNum,money);
                    bankRunner();
                }
                case 2 ->{
                    System.out.println("How much money you want to withdraw");
                    int money=sc.nextInt();
                    withDrawMoney(accountNum,money);
                    bankRunner();
                }
                case 3->{
                    showBalance(accountNum);
                    bankRunner();
                }
                case 4->{
                    System.out.println("What's your name?");
                    Scanner nj=new Scanner(System.in);
                    String name=nj.nextLine();
                    addAccount(name);
                    break;
                }
                case 5->{
                    System.out.println("Thank you for using our bank");
                    break;
                }
            }
        }
    }
}

public class aBank {
    public static void main(String[] args) throws IOException {
        bamk nj=new bamk();
        nj.bankRunner();
    }
}
