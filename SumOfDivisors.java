package com.java;

public class SumOfDivisors {
     private int number;
     
     public SumOfDivisors(int number) {
    	 this.number=number;
     }
	
	public static void main(String [] args) {
		SumOfDivisors sumdiv = new SumOfDivisors(6);
		int result = sumdiv.sumOfDiv();
		System.out.println("Sum of Divisors :" + result);
	}

	
	public int sumOfDiv() {
		int result =0;
		for(int i =2;i<number;i++) {
			if(number%i==0)
		 result += i;
	}
		return result;
	}
}
