package com.conditions;

public class Palindrome {
	
	Reverse rs=new Reverse();
	
	public boolean  ispalindrome(int n) {
		int rev=rs.reverse(n);
		boolean ispalindrome=false;
		if(rev==n) {
			ispalindrome=true;
		}
		return ispalindrome;
	}

	
}
