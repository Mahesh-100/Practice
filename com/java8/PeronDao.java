package com.java8;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;


public class PeronDao {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("mahesh",22),
                new Person("kumar",33),
                new Person("ram",14),
                new Person("raju",15),
                new Person("ganesh",23),
                new Person("suresh",34));

        Consumer<Person> printName = System.out::println;

        Predicate<Person> above =person -> person.getAge() > 18;

        Function<Person, Person> toUpperCase = person ->new Person(person.getName().toUpperCase(),person.getAge());

        Comparator<Person> byAge = Comparator.comparingInt(Person::getAge);

        List<Person>eligible=people.stream().filter(above).map(toUpperCase).sorted(byAge).toList();
        eligible.forEach(printName);


    }
}
