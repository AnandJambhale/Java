package com.cmp;


public class SandClock {
    public static void main(String[] args) {
        int n=9;

        //for upper triangle
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        //for middle star
        for(int i=0;i<=n+1;i++){
            System.out.print(" ");
            if(i==n+1){
                System.out.println("*");
            }
        }

        //for lower triangle
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=-1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

}
