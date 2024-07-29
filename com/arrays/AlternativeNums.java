package com.arrays;

import java.util.Arrays;

public class AlternativeNums {

	public void alternativeNums(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i += 2) {
			System.out.print(arr[i] + " ");
		}
	}

	public void primeNums(int[] arr) {

		for (int i : arr) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}

	public void countOfNumbers(int[] arr) {
		int countpositive = 0;
		int countnegative = 0;
		for (int i : arr) {
			if (i >= 0) {
				countpositive++;
			} else {
				countnegative++;
			}
		}
		System.out
				.println("count of positive numbers:" + countpositive + " count of negative numbers:" + countnegative);
	}

	public void bigInt(int[] arr) {
		int big = 0;
		int loc = 0;
		int count = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			count++;
			if (arr[i] > big) {
				big = arr[i];
				loc = count;
			}
		}
		System.out.println("biggest number:" + big + " with location:" + loc);
	}

	public boolean isTargetThere(int[] arr, int target) {

		boolean istarget = false;
		for (int i : arr) {
			if (i == target) {
				istarget = true;
			}
		}
		return istarget;
	}

	public void oddPosition(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 2 != 0 && arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

	public void sort(int[] arr) {
		int temp = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.println(arr[i]);
		}
	}

	public int[] reverse(int n) {
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = n % 10;
			n /= 10;
		}
		return arr;

	}

	public void order(int[] arr) {
		int isascending = 0;
		int isdescending = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				isascending++;
			}
			if (arr[i] > arr[i + 1]) {
				isdescending++;
			}
		}
		if (isascending == (arr.length - 1)) {
			System.out.println("Ascending order");
		} else if (isdescending == (arr.length - 1)) {
			System.out.println("descending order");
		} else {
			System.out.println("disorder");
		}
	}

	public void occurance(int[] arr) {
		Arrays.sort(arr);
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;
			} else {
				System.out.println("element:" + arr[i - 1] + " count:" + count);
				count = 1;
			}
		}
		System.out.println("element " + arr[arr.length - 1] + " count:" + count);
	}

	public void altPrimeNums(int[] arr) {
          int primecount=0;
          int[] primeArray=new int[arr.length];
		for (int i = 0; i < arr.length; i ++) {
			int count = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				primeArray[primecount]=arr[i];
				primecount++;
			  
			}
			
		}
		for(int i=0;i<primecount;i+=2) {
			System.out.println(primeArray[i]);
		}
	}

	public int[] remove(int[] arr) {
		int[] temp = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean isduplicate = false;
			for (int j = 0; j < k; j++) {
				if (arr[i] == temp[j]) {
					isduplicate = true;
					break;
				}
			}
			if (!isduplicate) {
				temp[k] = arr[i];

				k++;
			}
		}

		int[] rs = new int[k];
		for (int i = 0; i < k; i++) {
			rs[i] = temp[i];
		}
		return rs;
	}

	public void frequency(int n) {
		int[] temp = new int[10];
		while(n>0) {
			int digit=n%10;
			temp[digit]++;
			n/=10;
			
		}
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>0) {
				System.out.println("element:"+i+" count:"+temp[i]);
			}
		}
	}

	public void smallDifference(int[] arr) {
		int smalldiff = 999;
		int num1 = 0;
		int num2 = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int diff = Math.abs(arr[i] - arr[j]);
				if (smalldiff > diff) {
					smalldiff = diff;
					num1 = arr[i];
					num2 = arr[j];
				}
			}
		}
		System.out.println("the pair" + "(" + num1 + "," + num2 + "), with difference " + smalldiff);
	}
	

	
}
