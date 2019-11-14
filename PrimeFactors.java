package com.meno.learnings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactors {
	
	 static Set<Integer> primefactors = new HashSet<>();

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * System.out.println("enter no; "); Scanner in = new Scanner(System.in); double
	 * n= in.nextDouble();
	 * 
	 * for (int i = 2; i <= Math.sqrt(n); i++) { if(n%i==0) { System.out.println(i);
	 * 
	 * }
	 * 
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 */	
	
	// A function to print all prime factors 
	// of a given number n 
	public static  void primeFactors(int n) 
	{ 
		// Print the number of 2s that divide n 
		while (n%2==0) 
		{ 
			primefactors.add(2);// added to get only prime factors. no need for duplicates
			System.out.print(2 + " "); 
			n /= 2; 	 
		} 
		// n must be odd at this point. So we can 
		// skip one element (Note i = i +2) 
		for (int i = 3; i <= Math.sqrt(n); i+= 2) 
		{ 
			// While i divides n, print i and divide n 
			while (n%i == 0) 
			{ 
				primefactors.add(i);// added to get only prime factors. no need for duplicates
				System.out.print(i + " "); 
				n /= i; 
				
			} 
		} 

		// This condition is to handle the case when 
		// n is a prime number greater than 2 
		if (n > 2) {
			System.out.print(n); // added to get only prime factors. no need for duplicates
			primefactors.add(n);
		}
			
			
	} 

	public static void main (String[] args) 
	{ 
		System.out.println("enter no:: "); 
		Scanner in = new Scanner(System.in); 
		int n= in.nextInt();
		primeFactors(n); 
		System.out.println("\n Prime Numbers: "+primefactors); 
	} 

}
