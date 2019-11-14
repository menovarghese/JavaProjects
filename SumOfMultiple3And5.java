package com.meno.learnings;

public class SumOfMultiple3And5 {

	public static void main(String[] args) {
		long sum=0;
		
		for(int i=1;i<1000;i++) {
			if(i%3==0 ) {		
				sum=sum+i;
				continue;
			}else if(i%5==0 ) {		
				sum=sum+i;
				continue;
			}	
		}
		System.out.println(sum);
	}

}
