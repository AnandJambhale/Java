package com.day10;

import java.util.ArrayList;
import java.util.List;


class printList<T>{
    ArrayList<Object> array=new ArrayList<>();
    printList(ArrayList<T> array){
        System.out.println(array);
    }
}
public class Task {

    //Problem 1
    static double sumOfList(List<? extends Number> numbers){
        double sum=0.0;
        for (Number number:numbers){
            sum=sum+number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Object> array=new ArrayList<>(List.of(4L, 56L,52,82,2.0,'c',-124));

        //Problem 1
        ArrayList list=new ArrayList<>(List.of(45,12,78,96,20,'c',5.0d, 52L,-124));
        ArrayList list1=new ArrayList<>(List.of(4L, 56L,52,82,2.0));
        ArrayList <Byte>list2=new ArrayList<>();
//        System.out.println(sumOfList(list));
        System.out.println(sumOfList(list1));

        System.out.println(array);

        System.out.println(list);
        printList ls=new printList<>(list);
    }
}
