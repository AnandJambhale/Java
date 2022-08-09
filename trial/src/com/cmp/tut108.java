package com.cmp;


import java.util.Scanner;

interface anonyDemo{
    void meth1();
    void meth2();
}
public class tut108 {
    public static void main(String[] args) {
        anonyDemo gh=new anonyDemo() {
            @Override
            public void meth1() {
                System.out.println("I am in meth1");
            }

            @Override
            public void meth2() {
                System.out.println("I am in meth2");
            }
        };
        gh.meth1();
        gh.meth2();

    }
}
