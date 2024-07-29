package com.conditions;

public class Reverse {
	
	public int reverse(int n) {
		int temp=0;
		while(n!=0) {
			int q=n%10;
			temp=temp*10+q;
			n/=10;
			
		}
		return temp;
	}
	
	

}
