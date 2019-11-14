package com.meno.learnings;

public class FibonacciEvenDigitSum {

	public static void main(String[] args) {
		long firstNum=1;
		long secondNum=2;
		long num;
		long sum=0;
		while(secondNum<4000000) {
			if(secondNum%2==0) {
				sum=sum+secondNum;
			}
			num=firstNum+secondNum;
				firstNum=secondNum;
				secondNum=num;
				
			
		}
		System.out.println(sum);
		
		
		// no temp variable
		int one=1;
		int two=2;
		
		int sum2=2;
		
		while(two<4000000)
		{
			// Checking 
			one = one+two;
			if(one%2==0)
				sum2=sum2+one;

			two = one+two;
			if(two%2==0)
				sum2=sum2+two;
		}
		System.out.println(sum2);
	}

}
