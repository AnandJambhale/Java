package com.day11;

class myThread extends Thread{
    @Override
    public void run() {
        int x=0;
        while (x<200) {
            System.out.println("Good Evening");
            x++;
        }
    }
}
class myThread1 extends Thread{
    @Override
    public void run() {
        int x=0;
        while (x<200) {
            System.out.println("Good Morning");
            x++;
        }
    }
}

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        myThread1 m1=new myThread1();

        m1.start();
        myThread m2=new myThread();
        m2.start();
    }
}
