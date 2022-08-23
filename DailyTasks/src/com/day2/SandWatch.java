package com.day2;

public class SandWatch {
    public static void main(String[] args) {
        for (int i=0;i<5;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("* ");
            }
            for (int l = 5; l > i; l--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i=0;i<=10;i++) {
            System.out.print(" ");
            if (i==10){
                System.out.print("* ");
            }
        }
        for (int i=0;i<=5;i++) {
            for (int j = 5; j >= i; j--) {
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
