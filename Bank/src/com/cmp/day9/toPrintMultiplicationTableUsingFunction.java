package com.cmp.day9;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class toPrintMultiplicationTableUsingFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a number");
        int inp= sc.nextInt();
        List<Integer>list=IntStream.range(1,11).map(e->e*inp).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list);

//        List.of(10,9,8,7,6,5,4,3,2,1).stream().map(e->e*inp).forEach(System.out::println);
    }
}
