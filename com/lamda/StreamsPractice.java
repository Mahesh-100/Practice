package com.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice {

	public static void main(String[] args) {
		
		List<String>colors=Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
		
		List<String>upperCase=colors.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		List<String>lowerCase=colors.stream().map(String::toLowerCase).collect(Collectors.toList());
		
		System.out.println("Upper Case:"+upperCase);
		System.out.println("Lower Case:"+lowerCase);

		List<Integer>nums=Arrays.asList(3,5,6,7,8,10,22,33,55);
		System.out.println(sumOfEven(nums));
		System.out.println(sumOfOdd(nums));
	}
	
	public static int sumOfEven(List<Integer> nums){
		
		int sumofEven=nums.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		return sumofEven;
	}
	
	public static int sumOfOdd(List<Integer> nums) {
		int sumofOdd=nums.stream().filter(n->n%2==1).mapToInt(Integer::intValue).sum();
		return sumofOdd;
	}

}
