package com.day11;


class myThread6 extends Thread{
    @Override
    public void run() {
    int x=0;
    while (x<200) {
        System.out.println("Good Evening");
        x++;
        }
    }
}
class myThread5 extends Thread{
    @Override
    public void run() {
        int x=0;
        while (x<200) {
            System.out.println("Good Morning");
            x++;
        }
    }
}
 public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        myThread5 m1=new myThread5();
        m1.start();
        myThread6 m2=new myThread6();
        myThread3.sleep(200);
        m2.start();
        System.out.println("Priority of thread 3 is "+m2.getPriority());
        m1.setPriority(10);
    }
}
