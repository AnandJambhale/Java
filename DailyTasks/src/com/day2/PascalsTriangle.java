package com.day2;

public class PascalsTriangle {
    static int factoirial(int integer){
        if(integer==0){
            return 1;
        }
        return integer * factoirial(integer-1);
    }

    static int nCr(int n, int r){
        return factoirial(n)/(factoirial(r)*factoirial(n-r));
    }
    public static void main(String[] args) {
        for (int i=0;i<8;i++){
            for (int j=0;j<=i;j++){
                System.out.print(nCr(i,j)+" ");
            }
            System.out.println("");
        }
    }
}
