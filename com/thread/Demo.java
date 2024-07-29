package com.thread;

public class Demo {

	public static void main(String[] args) {
		
		Mythread m=new Mythread();
		ThreadA ta=new ThreadA();
		
		Thread th=new Thread(m);
		Thread th1=new Thread(ta);
	   
		th.start();
	    th1.start();
		
//		ThreadB obj1=new ThreadB("Computer Science");
//		ThreadB obj2=new ThreadB("Information technology");
//		Thread t1=new Thread(obj1);
//		Thread t2=new Thread(obj2);
		
	
//		try {
//			t1.start();
//			t2.start();
//			Thread.sleep(10000);
//			System.out.println( "Main thread Exiting...");
//		}catch (InterruptedException e) {
//			System.out.println("Main thread interrupting");
//	}
	
	
	    

}
}
