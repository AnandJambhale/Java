package com.day11;


    class myThread3 extends Thread{
        @Override
        public void run() {
            int x=0;
            while (x<200) {
                System.out.println("Good Evening");
                x++;
            }
        }
    }
    class myThread4 extends Thread{
        @Override
        public void run() {
            int x=0;
            while (x<200) {
                System.out.println("Good Morning");
                x++;
            }
        }
    }

    public class Task2 {
        public static void main(String[] args) throws InterruptedException {
            myThread4 m1=new myThread4();
            m1.start();
            myThread3 m2=new myThread3();
            myThread3.sleep(200);
            m2.start();
        }
    }
