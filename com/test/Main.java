package com.test;

import java.util.Scanner;

public class Main {

	 private int n;
	 
	 
	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int a=sc.nextInt();
		sc.close();
		
		Main m= new Main();
		m.setN(a);
		
		
		IsBigIntEven b=new IsBigIntEven();
		
		int bigInt=b.bigDigit(m.getN());
		
		boolean isBigEven=b.isBigEven(m.getN());
		
		if(isBigEven) {
			System.out.println("In the Given "+m.getN()+"  Big Digit is "+bigInt+" and Even");
		}else {
			System.out.println("In the Given "+m.getN()+"  Big Digit is "+bigInt+" and Odd");
		}
	

	}

}
