package com.stanrnd.tutorial;

public class ReverseStringWitoutOtherVariable {

	public static void main(String[] args) {
		String str = "stalin";
		char[] array = str.toCharArray();
		for(int i=0,j=array.length-1;i<(array.length) / 2;i++, j--) {
			array[i] = (char)(array[i] + array[j]);
			array[j] = (char)(array[i] - array[j]);
			array[i] = (char)(array[i] - array[j]);
		}
		
		System.out.println(new String(array));
		
	}

}
