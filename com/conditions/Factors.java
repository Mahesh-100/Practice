package com.conditions;

public class Factors {
	
	
	public static void factors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	
}
