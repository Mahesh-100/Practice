package com.conditions;

public class Prime {

	public boolean isPrime(int n) {
		boolean ls=false;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}	
		}
		if(count==2) {
			ls=true;
		}
		return ls;
		
	}
	
	public void firstfiveprime() {
		int count=0;
		int num=2;
		while(count<5) {
			if(isPrime(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
	
}
