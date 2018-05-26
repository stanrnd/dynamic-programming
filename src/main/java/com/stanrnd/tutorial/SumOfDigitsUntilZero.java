package com.stanrnd.tutorial;

public class SumOfDigitsUntilZero {

	public static void main(String[] args) {
		long num = 999999999999999999l;
		long sum = num;
		
		while(sum/10 != 0) {
			long temp = sum;
			sum = 0;
			while(temp != 0) {
				sum += temp % 10;
				temp /= 10;
			}
			
			System.out.println(sum);
		}
		
	}
	
	

}
