package com.conditions;

public class Factorial {
	
	public double factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
			
		}
		return fact;
		
	}

}
