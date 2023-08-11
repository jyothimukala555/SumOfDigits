package com.java;


	public class SumOfNNumbers {
		
	    private int number;

		public SumOfNNumbers( int number) {
			this.number = number;
		}
		
		public static void main(String [] args) {
			
			SumOfNNumbers sumNumbers =new SumOfNNumbers(5);
			int sum = sumNumbers.sumofNumbers();
		     System.out.println("Sum Of N Numbers: "+ sum );
		}
		

		
		public int sumofNumbers() {
			int sum =0;
			for(int i=0;i<=number;i++) {
				sum = sum + i;
			}
			return sum;
		}
	}

