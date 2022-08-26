package com.day2;

import java.util.Scanner;

public class SandWatchHorizontal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int o=sc.nextInt();

        for (int i=0;i<o;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=o;j>i;j--){
                System.out.print("  ");
            }
            for (int j=o;j>i;j--){
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<o*2+2;i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i=0;i<o;i++){
            for (int j=o;j>i;j--){
                System.out.print("* ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for (int j=o;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
