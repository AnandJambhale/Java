package com.cmp;

import java.util.Scanner;

class Pascal{
    int factorial(int i){
        if(i==0){
            return 1;
        }
        return i*factorial(i-1);
    }
    int nCr(int n, int r){
        return factorial(n)/(factorial(n-r)*factorial(r));
    }
}

public class PascalsTriangleRight {
    public static void main(String[] args) {
        Pascal P=new Pascal();
        Scanner sc=new Scanner(System.in);
        int l= sc.nextInt();
        for(int i=0;i<l;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" "+P.nCr(i,j));
            }
            System.out.println("");
        }
    }
}
