package com.day2;

import java.util.Scanner;

public class SandWatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int o=sc.nextInt();
        for (int i=0;i<o;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = o; k > i; k--) {
                System.out.print("* ");
            }
            for (int l = o; l > i; l--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i=0;i<=o*2;i++) {
            System.out.print(" ");
            if (i==o*2){
                System.out.print("* ");
            }
        }
        for (int i=0;i<=o;i++) {
            for (int j = o; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
