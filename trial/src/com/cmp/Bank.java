package com.cmp;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class  Writer {
    FileWriter writer;
    {
        try {
            writer = new FileWriter("accounts.txt", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Bank2 extends Writer{
    void addAccount(String HolderName){
        Random random=new Random(1000000000);
        int AccountNum= random.nextInt();
        try {
            writer.append(HolderName+" : "+AccountNum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    void addMoney(int money){
        Scanner sc=new Scanner(System.in);
        String toSearch=sc.next();
        Scanner scan=new Scanner("accounts.txt");
        while (scan.hasNext()){
            String search=scan.next();
            if(search.equalsIgnoreCase(toSearch)){
                int mone=scan.nextInt();
                System.out.println(mone);
            }
        }
    }

}
class BabyNames {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("name? ");
        String name = console.next();

        Scanner input = new Scanner(new File("names.txt"));
        while (input.hasNext()) {
            String search = input.next();
            if (search.equalsIgnoreCase(name)) {
                System.out.println("found");
            }
        }
    }
}

public class Bank {
//    public static void main(String[] args) {
//        Bank2 gh=new Bank2();
//        gh.addAccount("Anand");
//    }
}
