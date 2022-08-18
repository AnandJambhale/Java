package com.cmp.day9;

import java.util.Scanner;

public class GenerateElectricityBill {
    public static int generator(int units){
        if (units<=100){
            return units*5;
        }
        if (units>100 && units<=200){
            return (units-100)*7 + generator(100);
        }
        else {
            return (units-200)*10 + generator(200);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many units you have consumed?");
        int inp=sc.nextInt();
        System.out.println("Ypur bill will be of Rs "+generator(inp));

    }
}
