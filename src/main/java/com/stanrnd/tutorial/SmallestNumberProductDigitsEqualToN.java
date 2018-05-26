package com.stanrnd.tutorial;

import java.util.Stack;

public class SmallestNumberProductDigitsEqualToN {

	public static void main(String[] args) {
		int num = 100;
		
		Stack<Integer> stack = new Stack<>();
		int i=9;
		while(i>1) {
			if(num%i == 0) {
				stack.push(i);
				num /= i;
				i=9;
			} else {
				--i;
			}
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
	}

}
