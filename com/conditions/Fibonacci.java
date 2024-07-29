package com.conditions;

public class Fibonacci {
	
	public boolean isFibonacci(int n) {
		boolean isFibonacci=false;
		int a=0;
		int b=1;
		int c=0;
		while(c<n) {
			c=a+b;
			a=b;
			b=c;
		}
		if(c==n) {
			isFibonacci=true;
		}
		return isFibonacci;
	}

	
	public void firstTenFibonacci() {
		int count=0;
		int num=0;
		while(count<10) {
			if(isFibonacci(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
	
}
