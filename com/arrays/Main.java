package com.arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception  {
		
		Scanner sc=new Scanner(System.in);
		AlternativeNums an=new AlternativeNums();
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter elements");
		int[] a=new int[n];
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
	
//		System.out.println("printing alternative numbers");
//	   an.alternativeNums(a);
//	   System.out.println("Printing last elements to First element");
//	   for(int i=a.length-1;i>=0;i--) {
//			System.out.println(a[i]);
//		}
//	   System.out.println("printing prime numbers");
//	   an.primeNums(a);
//	   an.countOfNumbers(a);	
//		an.bigInt(a);
//		  System.out.println(an.isTargetThere(a, n));   
//		an.oddPosition(a);
//		an.sort(a);
//		int[] a=an.reverse(n);
//		for(int i:a) {
//			System.out.println(i);
//		}
//		an.order(a);
//		an.occurance(a);

		an.altPrimeNums(a);
//		an.frequency(a);
//	   int[] b=an.remove(a);
//	   for(int i:b) {
//		   System.out.println(i);
//	   }
//	an.frequency(n);
//		an.smallDifference(a);
		
	   sc.close();
	    
	}

	

}
