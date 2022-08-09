package com.Practice;

public class randomFortunes{
    public String getFortune(){
        String[] fortunes = {"Hi how are you", "Good Morning", "Good Evening"};
        int i = (int) (Math.random() * (3));
        return fortunes[i];
    }

}
