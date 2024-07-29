package com.conditions;

import java.util.Scanner;

public class Simplecalculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first number:");
     int a =sc.nextInt();
     System.out.println("enter second number:");
     int b=sc.nextInt();
     System.out.println("select operator:\n1.Addition\n2.Subtraction\n3.Mul"
     		+ ""
     		+ ""
     		+ "tiplication\n4.Division\n5.Exponential");
      int opt=sc.nextInt();
      switch (opt) {
	case 1:
		System.out.println("The result = "+ (a+b));
		
		break;
	case 2:
		System.out.println("The result="+ (a-b));
		
		break;
	case 3:
		System.out.println("The result="+ (a*b));
		
		break;
	case 4:
		System.out.println("The result="+ (a/b));
		
		break;
	case 5:
		System.out.println("The result="+ (Math.pow(a, b)));
		
		break;

	default:
		System.out.println("Invalid Input");
		break;
	}
      sc.close();
     
	}

	

}
