package com.java8;


import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {


        //        Sum s= (x,y)->x-y;
//        int res=s.cal(4,6);
//        System.out.println(res);
//
//        Consumer<String> printName = System.out::println;
//        Predicate<String> isEmptyString= String::isEmpty;
//        System.out.println(isEmptyString.test(""));
//        System.out.println(isEmptyString.test("abc"));
//
//        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");
//
//        stringList.replaceAll(String::toUpperCase);
//        System.out.println(stringList);
//        stringList.replaceAll(String::toLowerCase);
//        System.out.println(stringList);
//
//        BiFunction<String,String,String> concatenate= (x,y)->x+y;
//        String string="mahesh";
//        String string2="kumar";
//        String result= concatenate.apply(string, string2);
//        System.out.println(result);


        List<Integer> list = Arrays.asList(10, 2,2,5, 13,13, 4, 5,5, 16, 7, 8, 19,10, 10);
          list.stream().filter(n->n%2==0).forEach(System.out::println);
          list.stream().map(String::valueOf).filter(n->n.startsWith("1")).forEach(System.out::println);
          Set<Integer> set = new HashSet<>();
          List<Integer>dup=list.stream().filter(n->!set.add(n)).toList();
          System.out.println(dup);
          list.stream().distinct().forEach(System.out::println);
        list.stream().limit(1).forEach(System.out::println);
        list.stream().findFirst().ifPresent(System.out::println);
         System.out.println((long) list.size());
        int max=list.stream().max(Integer::compareTo).get();
        System.out.println(max);
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


    }
}
