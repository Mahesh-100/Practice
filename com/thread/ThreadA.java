package com.thread;

import com.conditions.Prime;

public class ThreadA implements Runnable {

	
	@Override
	synchronized public void run() {
		Prime pr=new Prime();
		int n=0;
		try {
		while(n<1000) {
			if(pr.isPrime(n)) {
			System.out.println("Prime Number:"+n);
			}
			n++;
			Thread.sleep(2000);
		}
		}catch(InterruptedException e) {
			System.out.println("something went wrong");
		}
		
	}

}

