package com.meno.learnings;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int one=0;
		int two=1;

		while(two<100)
		{
			one = one+two;
			System.out.println(one);
			two = one+two;
			System.out.println(two);			
		}
	}
}
