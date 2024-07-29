package com.conditions;

public class TargetDigit {
	
	public void isTargetThere(int n, int t) {
		int count=0;
		int rem=0;
		boolean isthere=false;
		while(n>0) {
			rem=n%10;
			if(rem==t) {
				isthere=true;
				count++;
				
				
			}
			n=n/10;
		}
		if(isthere==true) {
			System.out.println("the digit is there and repeated"+count+"times");
		}else {
			System.out.println("not there");
		}
		
	}
	
	public boolean isFibonacci(int n) {
		boolean isFibonacci=false;
		int a=0;
		int b=1;
		int c=0;
		while(c<n) {
			c=a+b;
			a=b;
			b=c;
		}
		if(c==n) {
			isFibonacci=true;
		}
		return isFibonacci;
	}

	
	public void firstTenFibonacci() {
		int count=0;
		int num=0;
		while(count<10) {
			if(isFibonacci(num)) {
				System.out.println(num);
				count++;
				
			}
			num++;
		}
	}
	public int countdigits(int n) {
		int count=0;
		while(n!=0) {
			int r=n%10;
			count++;
			n/=10;
			
		}
		return count;
	}
	public void smallAndPosition(int n) {
		int smalldigit=Integer.MAX_VALUE;
		int count=0;
		int loc=0;
		while(n!=0) {
			int r=n%10;
			count=count+1;
			if(smalldigit>r) {
				smalldigit=r;
				loc=count;
			}
			n/=10;
			
		}
		System.out.println("the small digit in number "+smalldigit+" in the "+loc+" position");
		
	}
	public  boolean isPerfect(int n) {
		int temp=0;
		boolean isperfect=false;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				
				temp+=i;
			}
		}
		if(temp==n) {
			isperfect=true;
		}
		return isperfect;
	}

	
	public int  bigdigit(int n) {
		int bigdigit=0;
		
		while(n!=0) {
			int r=n%10;
			if(bigdigit<r) {
				bigdigit=r;
			}
			
			n/=10;
			
		}
		return bigdigit;
		
		
	}
	
	public void spellNumber(int n) {
		Reverse rs=new Reverse();
		int rev=rs.reverse(n);
		while(rev!=0) {
			int r=rev%10;
			rev=rev/10;
			switch (r) {
			case 0:
				System.out.print(" Zero");
				break;
			case 1:
				System.out.print(" One");
				break;
			case 2:
				System.out.print(" Two");
				break;
			case 3:
				System.out.print(" Three");
				break;
			case 4:
				System.out.print(" Four");
				break;
			case 5:
				System.out.print(" Five");
				break;
			case 6:
				System.out.print(" Six");
				break;
			case 7:
				System.out.print(" Seven");
				break;
			case 8:
				System.out.print(" Eight");
				break;
			case 9:
				System.out.print(" Nine");
				break;
			

			default:
				System.out.println("Invalid");
				break;
			}
		}
	}
	
	public boolean checkAllDigitsequal(int n) {
		int firstdigit=0;
		int ecount=0;
		int count=0;
		int lastdigit=n%10;
		boolean isallDigitequal=false;
		while(n!=0) {
			 firstdigit=n%10;
			 count++;
			if(firstdigit==lastdigit) {
				ecount++;
			}
			n=n/10;
		}
		if(count==ecount) {
			isallDigitequal=true;

		}
		return isallDigitequal;
	}
	public void denomination(int n) {
		int fhd=0;
		int hd=0;
		int fiv=0;
		int tn=0;
		int rp=0;
		int twn=0;
		int r=0;
		int th=0;
		if(n>=1000) {
			 th=n/1000;
			 r=n%1000;
		}
		if(r>=500) {
			fhd=r/500;
			r%=500;
		}
		if(r>=100) {
			hd=r/100;
			r%=100;
		}
		if(r>=50) {
			fiv=r/50;
			r%=50;
		}
		if(r>=20) {
			twn=r/20;
			r%=50;
		}
		if(r>=10 ) {
			tn=r/10;
			r%=10;
		}
		if(r>=1) {
			rp=r;
		}
		System.out.println("the required 1000rs notes:"+th+" 500rs notes:"+fhd+" 100rs notes:"+hd+" 50rs notes:"+fiv+" 20rs notes:"+twn+" 10rs notes:"+tn+" rupees:"+rp);
	}
	
	public int secondMax(int n) {
		int bd=bigdigit(n);
		int secondmax=0;
		while(n!=0) {
			int r=n%10;
			if(r>secondmax && r<bd) {
				secondmax=r;
			}
			n/=10;
		}
		return secondmax;
	}
	
	public int firstAndLastSum(int n) {
		int firstdigit=0;
	
		int lastdigit=n%10;
		while(n!=0) {
			 firstdigit=n%10;
			
			n=n/10;
		}
		return lastdigit+firstdigit;
		
		
	}
	public void divisors() {
		int num=0;
		int maxcount=0;
		for(int i=2;i<=25;i++) {
			int divcount=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
				divcount++;
				}
			}
			if(divcount>maxcount) {
				maxcount=divcount;
				num=i;
			}
		}
		System.out.println("Number"+num+"with"+maxcount+"divisors");
	}
	public int alternateSum(int n) {
		int p=1;
		int sum=0;
		while(n>0) {
			int r=n%10;
			if(p%2!=0) {
				sum+=r;
			}
			else {
				sum=sum;
			}
			n/=10;
			p++;
		}
		return sum;
	}
	
	public void occurance(int n) {
		        int count0 = 0;
		        int count1 = 0;
		        int count2 = 0;
		        int count3 = 0;
		        int count4 = 0;
		        int count5 = 0;
		        int count6 = 0;
		        int count7 = 0;
		        int count8 = 0;
		        int count9 = 0;

		        while (n > 0) {
		            int digit = n % 10;  
		            switch (digit) {
		                case 0: count0++; break;
		                case 1: count1++; break;
		                case 2: count2++; break;
		                case 3: count3++; break;
		                case 4: count4++; break;
		                case 5: count5++; break;
		                case 6: count6++; break;
		                case 7: count7++; break;
		                case 8: count8++; break;
		                case 9: count9++; break;
		            }
		            n /= 10;  
		        }

		        System.out.println("Occurrences of each digit:");

		        if (count0 >
		        0) {
		        	System.out.println("0: " + count0);
		        }
		        	
		        if (count1 > 0) {
		        	System.out.println("1: " + count1);
		        }
		        if (count2 > 0) {
		        	System.out.println("2: " + count2);
		        }
		        if (count3 > 0) {
		        	System.out.println("3: " + count3);
		        }
		        if (count4 > 0) {
		        	System.out.println("4: " + count4);
		        }
		        if (count5 > 0) {
		        	System.out.println("5: " + count5);
		        }
		        if (count6 > 0) {
		        	System.out.println("6: " + count6);}
		        
		        if (count7 > 0) {
		        	System.out.println("7: " + count7);}
		        
		        if (count8 > 0) {
		        	System.out.println("8: " + count8);}
		        
		        if (count9 > 0) {
		        	System.out.println("9: " + count9);
		    }
		}
}
