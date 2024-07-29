package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		bigDigit(7869);
		int[] arr= {3,4,5,3,6,3,7};
		int t=3;
		System.out.println(occurance(arr, t));
		
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		System.out.println("Enter the operator: \n 1.'+',\n 2.'-',\n 3.'*',\n 4.'/'");
		int operator=sc.nextInt();
		
		switch (operator) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		List<Product>products=new ArrayList<Product>();
		products.add(new Product("Inspiron 15","Dell",55000));
		products.add(new Product("XPS 13","Dell",70000));
		products.add(new Product("Pavilion 14","HP",45000));
		products.add(new Product("MacBook Air","Apple",90000));
		products.add(new Product("Vostro 14","Dell",49000));
		
		
		
		products.forEach(n->System.out.println(n.getCompany()));
		
		List<Double>res=products.stream()
				.map(n->n.getPrice()+10000).collect(Collectors.toList());
		
		
		
		System.out.println(res);
		List<Product>dellLaptops=products.stream().
				filter(p -> p.getCompany().equalsIgnoreCase("DELL"))
				.filter(p->p.getPrice()>50000).collect(Collectors.toList());
		
		System.out.println(dellLaptops);
		
		
		sc.close();

	}

	public static void bigDigit(int n) {
		
		int bigDigit=0;
		while(n!=0) {
			int r=n%10;
			if(bigDigit<r) {
				bigDigit=r;
			}
			n/=10;
		}
		if(bigDigit%2==0) {
			System.out.println("Big Digit :"+bigDigit+" and even");
		}else {
			System.out.println("Big Digit :"+bigDigit+" and odd");
		}
	}
	
	public static int occurance(int[] arr,int t) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==t) {
				count++;
			}
		}
		return count;
	}
	
	
	
}
