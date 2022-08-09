package com.cmp;

public class SandClockHorizontal {
    public static void main(String[] args) {
        int n=9;

        //for upper triangle
        for(int i=0;i<n/2;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            for(int k=n/2;k>i;k--){
                System.out.print("    ");
            }
            for(int l=0;l<=i;l++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        //for middle line
        for(int i=0;i<n/2;i++){
            System.out.print(" * *");
            if(i==n/2-1){
                System.out.println(" * *");
            }
        }

        //for lower trianle
        for(int i=0;i<n/2;i++){
            for(int j=n/2;j>i;j--){
                System.out.print(" *");
            }
            for(int k=0;k<=i;k++){
                System.out.print("    ");
            }
            for(int l=n/2;l>i;l--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
