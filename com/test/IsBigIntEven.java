package com.test;

public class IsBigIntEven {
	
	public boolean isBigEven(int n) {
		int max=bigDigit(n);
		if(max%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int bigDigit(int n) {
		int max=0;
		while(n!=0) {
			int r=n%10;
			if(max<r) {
				max=r;
			}
			n/=10;
		}
		return max;
	}

}

