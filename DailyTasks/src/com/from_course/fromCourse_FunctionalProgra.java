package com.from_course;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class fromCourse_FunctionalProgra {
    public static void main(String[] args) {
//        List<Integer>list=List.of(1,2,3,4,5,6,7);
//        list.stream().filter(elem-> elem%2==0).forEach(element-> System.out.println(element)); //in filter u can use different name or same

        //to print sum of numbers in list  (we are using 2
//        int sum=list.stream().reduce(0,(num1,num2)->num1+num2);
//        System.out.println(sum);

        //to print sum of only odd numbers drom list
//        int oddSum=list.stream().filter(ele->ele%2==1).reduce(0,(num1,num2)->num1+num2);
//        System.out.println(oddSum);

        //LAMBDA expression
//        list.stream().reduce(0,(num1,num2)->{
//            System.out.println(num1+" "+num2);
//            return num1+num2;     //if you are writing multiple statements in reduce then return is neede to be mentioned else it take it by itself that here return is present like in num1+num2
//        }
//        );
//        System.out.println(sum);


        //reduce, foreach are terminal operations
        //filter, distinct, map is intermediate operation


        //sorting list
//        List<Integer>numbers=List.of(4,44,7,85,147,63,52,78);
//        List<Integer>Num2=new ArrayList<>();
//        numbers.stream().sorted().forEach(e-> Num2.add(e));
//        System.out.println(Num2);

        //to not to print duplicate elements in list(distinct)
//        List<Integer>nums=List.of(3,5,3,213,45,5,7);
//        nums.stream().distinct().forEach(e-> System.out.print(e+" "));
        //to sort in distinct
//        System.out.println();  //just to separate from upper output
//        nums.stream().sorted().distinct().forEach(e-> System.out.print(e+" "));

        //to print square of distinct elements
//        System.out.println();
//        nums.stream().distinct().map(e->e*e).sorted().forEach(e-> System.out.print(e+" "));  //u can also use sorted after map


        //to print squares of first 10 ints
//        System.out.println();
//        IntStream.range(1,11).map(e->e*e).forEach(e-> System.out.print(e+" "));

        //mapping all elements in list to lowercase
//        System.out.println();
//        List<String>list1=List.of("Anand","Vilas","Jambhale");
//        list1.stream().map(e->e.toLowerCase()).forEach(e-> System.out.print(e+" "));

        //to print length of each elements
//        System.out.println();
//        list1.stream().forEach(e-> System.out.print(e.length()+" "));
//        //OR
//        System.out.println();
//        list1.stream().map(e->e.length()).forEach(e-> System.out.print(e+" "));

        //to print sum of numbers from 1 to 10
//        int sumTo10=IntStream.range(1,10).reduce(0,(num1, num2)->num1+num2);
//        System.out.println(sumTo10);


        //to find max element of list
//        System.out.println(List.of(12,45,78,56,23).stream().max((n1,n2)->Integer.compare(n1,n2)));  //optional is an type which take care of null output
//
//        System.out.println(List.of(12,45,78,56,23).stream().max((n1,n2)->Integer.compare(n1,n2)).get());


        //to collect filtered elements in list
//        List<Integer>nu=List.of(3,5,3,213,45,5,7).stream().filter(e->e%2==1).collect(Collectors.toList());
//        System.out.println(nu);


        //to print squares of even numbers from 1 to 10 (here boxed() is necessary to use)
//        List<Integer>squares=IntStream.range(1,11).filter(e->e%2==0).map(e->e*e).boxed().collect(Collectors.toList());
//        System.out.println(squares);


        //instead of doing s->s.legth() or forEach(s->sout(s))  (just to make it more readable)
//        List.of("Anand" ,"Bat", "Cat").stream().map(String::length).forEach(System.out::println);   //to print all elements


        //to make local variable
        Predicate<Integer> evenIntegerPredicate = n -> n % 2 == 0;
        Predicate<Integer> oddIntegerPredicate = n -> n % 2 == 1;
        List.of(45,12,56,85,2,3,5).stream().filter(evenIntegerPredicate).forEach(System.out::println);

    }
}
