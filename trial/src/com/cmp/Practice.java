package com.cmp;

import  java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        for(int i=65;i<123;i++){
//            System.out.println((char) i);
//        }
//
//        int l=45;
//        short kl=(short) l;
//        System.out.println(kl);
//
//        int g=Integer.MAX_VALUE;
//        int a=Math.max(5,6);
//        System.out.println(a);


        //concatination
        String str1="Anand";
        String str2="idigicloutech";
        System.out.println("i am "+str1+" I work in "+str2);

        //Array
//        int[]arr=new int[10];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=2;
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);;
//        }


        //Typecasting
        int j=56;
        short k=(short) j;
        System.out.println(k+5);
        System.out.println(k);
        for(int i=0;i<6;i++){
            System.out.println(k+i);
        }

//        Scanner sc=new Scanner(System.in);
//        System.out.println((int)sc.nextInt());

    }
}
