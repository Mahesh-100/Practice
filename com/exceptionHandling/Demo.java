package com.exceptionHandling;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Demo {

	public static void main(String[] args)    {
     
		String path="C:\\Users\\Durgasi Mahesh kumar\\Documents\\file.txt";
		
		try {
			List<Integer>numsList=negativeNumsCheckInFile(path);
			checkduplicate(numsList);
			Iterator<Integer>it=numsList.iterator();
			while(it.hasNext()) {
				  System.out.println(it.next());
				}
			
			//readFile(path);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Duplicate_Exception e) {
			System.out.println(e.getMessage());
		
			
		}
		
	}

	public static void readFile(String filepath) {
		File file=new File(filepath);
		try {
			Scanner sc=new Scanner(file);
		if(!sc.hasNextLine()) {
			throw new NullPointerException("File can not be empty");
		}
		sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File doest not exist....");
			e.printStackTrace();
		}
	}
	
	public static List<Integer> negativeNumsCheckInFile(String filepath)   {
		File file=new File(filepath);
		List<Integer> nums=new ArrayList<Integer>();
		
		try (Scanner sc = new Scanner(file)) {
			while(sc.hasNextLine()) {
				int num=Integer.parseInt(sc.nextLine());
				nums.add(num);
			}
			sc.close();
		} 
			catch (FileNotFoundException e) {
		
			System.out.println("File doest not exist....");
			e.printStackTrace();
		}
		return nums;
		
	}
	public static void checkduplicate(List<Integer> list) throws Duplicate_Exception {
	    Set<Integer>uniqueNumbers=new HashSet<Integer>();
	    for(int num:list) {
	    	if(uniqueNumbers.contains(num)) {
	    		throw new Duplicate_Exception("Duplicates are found");
	    	}
	    	uniqueNumbers.add(num);
	    }
	}
}
