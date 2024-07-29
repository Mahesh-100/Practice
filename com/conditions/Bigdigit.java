package com.conditions;

public class Bigdigit {
	
	public void bigdigit(int n) {
		int bigdigit=0;
		int secondmax=0;
		while(n!=0) {
			int r=n%10;
			if(bigdigit<r) {
				bigdigit=r;
			}
			if(r>secondmax && r<bigdigit) {
				r=secondmax;
			}
			n/=10;
			
		}
		System.out.println("the max number:"+bigdigit+" the secondmax:"+secondmax);
		
	}
	
	

}
