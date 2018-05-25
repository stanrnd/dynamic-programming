package com.stanrnd.tutorial;

public class ArrayContiguousIntegers {

	public static void main(String[] args) {
		int[] array = { 5, 2, 3, 6, 4, 4, 6, 6 };
		int min = array[0], max = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i] < min) {
				min = array[i];
			}
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		int[] temp = new int[max-min+1];
		for(int a:array) {
			temp[max-a]++;
		}
		
		int j=0;
		for(;j<temp.length && temp[j] > 0;j++);
		
		if(j == temp.length) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}
