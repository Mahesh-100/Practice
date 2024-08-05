package com.java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeDao {

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee("mahesh",22,30000,"Development"),
                new Employee("kumar",23,35000,"HR"),
                new Employee("fairish",25,45000,"HR"),
                new Employee("suresh",39,60000,"IT"),
                new Employee("ramesh",38,70000,"finance"),
                new Employee("sirisha",45,80000,"IT"),
                new Employee("raghu",27,760000,"Development"),
                new Employee("ganesh",42,68000,"finance")

        );
        // Filter out employees who are not in a specified department.
        String targetDepartment="HR";
        Predicate<Employee> listOfTargetDept= e -> !e.getDepartment().equals(targetDepartment);
        //employees.stream().filter(listOfTargetDept).forEach(System.out::println);

        // Group employees by their department.
        Map<String, List<Employee>> groupingByDept=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
       // groupingByDept.entrySet().forEach(System.out::println);

        // Calculate the average salary for each department.
        Map<String,Double>avgSalByDept=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        // avgSalByDept.entrySet().forEach(System.out::println);

        // Find the highest-paid employee in each department.
        Map<String, Optional<Employee>> highPaidEmp=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
       // highPaidEmp.entrySet().forEach(System.out::println);


        System.out.println("Employees by department:");
        groupingByDept.forEach((department,employList)->{
            System.out.println(department+":"+employList);
        });

        System.out.println("\nAverage salary by department:");
        avgSalByDept.forEach((department, avgSalary) -> {
            System.out.printf("%s: %.2f%n", department, avgSalary);
        });


        System.out.println("\nHighest paid employee by department:");
        highPaidEmp.forEach((department,emp)->{
            emp.ifPresent(employee->System.out.println(department+":"+employee));
        });
    }




}
