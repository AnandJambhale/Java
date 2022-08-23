package com.from_course;

import java.util.ArrayList;
import java.util.List;

class Gen{
    <X extends List> void duplicate(X list){
        list.addAll(list);
    }
}

class Custom<T>{
    ArrayList<T>array= new ArrayList<T>();
    public void custom(T element){
        array.add(element);
    }
    public void custo(T element){
        array.remove(element);
    }
    public void print(){
        System.out.println(array);
    }
}
public class Generics {

    //Upper Bound
    static double sumOfList(List<? extends Number>numbers){
        double sum=0;
        for (Number number:numbers){
            sum=sum+number.doubleValue();
        }
        return sum;
    }

    //Lower Bound
    static void addCoupleofValues(List<? super Number>nums){
        double sum=0.0;
//        for (Number num:nums){     //this wont work here
//            sum=sum+num.doubleValue();
//        }

        nums.add(45);
        nums.add(23);
    }
    public static void main(String[] args) {
        Custom c1=new Custom();
        c1.custom(45);
        c1.custom("Anand");
        System.out.println(c1.array);

        ArrayList list=new ArrayList<>(List.of(45,12,78,96,20));
        ArrayList list1=new ArrayList<>(List.of(4L, 56L,52,82,2.0));
        System.out.println(sumOfList(list));
        System.out.println(sumOfList(list1));

        addCoupleofValues(list1);
        System.out.println(list1);

    }
}
