package com.cmp;

public class PascalsTriangleLeft {
    public static void main(String[] args) {
        int n=5;
        Pascal hj=new Pascal();
        for(int i=0;i<n;i++){
            for (int k=5;k>i;k--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+hj.nCr(i,j));
            }
            System.out.println("");
        }
    }
}
