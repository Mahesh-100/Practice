package com.strings;

import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) {
		
		String str="mahesh kumar durgasi";
		//String str1="rahu";
		
//	    countOfVowelsAndConsonents(str);
//	    countOfWordsAndChars(str);
//		reverse(str);
//		countAlphaNumeric(str);
//		setOfvowelsAndCons(str);
//		capitalToVowel(str);
//		int st=lenGth(str);
//		System.out.println(st);
//		firstLetterCap(str);
		lastLetterCap(str);

	}
	
	public static void countOfVowelsAndConsonents(String st) {
		int vowelcount=0;
		int consonentcount=0;
		
		String str=st.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowelcount++;
			}else  if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
				consonentcount++;
			}
		}
		System.out.println("vowels count: "+vowelcount+" consonents count: "+consonentcount);
	}
	
	public static void countOfWordsAndChars(String st) {
	
		int countwords=1;
		int countchars=0;
		int spacecount=0;
		int i=0;
		String str=st.trim();
		for( i=0;i<str.length();i++) {
			
			 if(str.charAt(i)>='a'&& str.charAt(i)<='z') {			
				 countchars++;
			 }
			 if(str.charAt(i)==' ') {
					spacecount++;
					countwords++;
					continue;
				}
			 }
			
			System.out.println("words count: "+(countwords) +" count chars:"+(countchars-spacecount));
			
		}
	

	public static void countAlphaNumeric(String str) {
		int alphacount=0;
		int numericCount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				alphacount++;
			}
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				numericCount++;
			}
		}
		System.out.println("Alpha count:"+alphacount+" digit count:"+numericCount);
	}
	public static void reverse(String str) {	
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
	}
	public static void setOfvowelsAndCons(String st) {
		char v[]=new char[st.length()];
		char c[]=new char[st.length()];
		String str=st.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				v[i]=str.charAt(i);
			}else {
				c[i]=str.charAt(i);
			}
		}
		String vo=String.valueOf(v);
		String co=String.valueOf(c);
		System.out.println("vowels:"+vo+" consonents:"+co);
	}
	
   public static void capitalToVowel(String str) {
	   for(int i=0;i<str.length();i++) {
		 char c=str.charAt(i);
		   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				c=Character.toUpperCase(c);
			}  
		   System.out.print(c);
	   }
   }
   
   public static String delete(String str,int n) {
	   
	   StringBuilder st=new StringBuilder(str);
	  st.delete(0, n);
	return st.toString();
   }
   public static String eliminate(String str) {
	   char ch[]=new char[str.length()];
	   for(int i=0;i<str.length();i++) {
		   if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
			  ch[i]=str.charAt(i);
		   }
	   }
	   String ele=String.valueOf(ch);
	return ele;
	   
   }
   public static int lenGth(String str) {
	   int count=0;
	   for(char ch:str.toCharArray()) {
		   count++;
	   }
	return count;
   }
   
   public static void occurance(String str) {
	
	   for(int i=0;i<str.length()-1;i++) {
		   
	   }
	   
   }
   public static void firstLetterCap(String str) {
	   StringTokenizer st= new StringTokenizer(str);
	   while(st.hasMoreTokens()) {
		 String   str1=st.nextToken();
		 for(int i=0;i<str1.length();i++) {
			 if(i==0) {
				 
			 System.out.print(Character.toUpperCase(str1.charAt(i))); 
			 
			 }else {
				 System.out.print(str1.charAt(i));
			 }
			
		 }
		 
	   }
   }
   
   public static boolean compare(String str1,String str2) {
	   boolean compare =false;
	   int count=0;
	   if(str1.length()==str2.length()) {
		   for(int i=0;i<str1.length();i++) {
			   if(str1.charAt(i)==str2.charAt(i)) {
				   count++;
			   }
		   }
	   }
	   if(str1.length()==count) {
		   compare=true;
	   }
	   
	return compare;
   }
   public static void lastLetterCap(String str) {
	   StringTokenizer st=new StringTokenizer(str);
	   while(st.hasMoreTokens()) {
			 String   str1=st.nextToken();
			 for(int i=0;i<str1.length();i++) {
				 if(i==str1.length()-1) {
					 
				 System.out.print(Character.toUpperCase(str1.charAt(i))); 
				 
				 }else {
					 System.out.print(str1.charAt(i));
				 }
				
			 }
			 
		   }
   }
   
}
