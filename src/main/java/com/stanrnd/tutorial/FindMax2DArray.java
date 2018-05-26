package com.stanrnd.tutorial;

public class FindMax2DArray {

	public static void main(String[] args) {
		int[][] a = new int[][] {
			{0, 1, 1, 1},
			{0, 0, 1, 1},
			{1, 1, 1, 1},
			{0, 0, 0, 0},
		};
		
		System.out.println(search(a[2], 0, 3));
		
	}
	
	private static int search(int[] a, int start, int end) {
		if(start <= end) {
			int mid = start + (end - start) / 2;
			if((mid == 0 || a[mid-1] == 0) &&  a[mid] == 1) {
				return mid;
			} else if(a[mid] == 0) {
				return search(a, mid+1, end);
			} else {
				return search(a, start, mid-1);
			}
		}
		return -1;
	}

}
