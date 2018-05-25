package com.stanrnd.tutorial;

import java.util.Stack;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "Hi Stalin How are you";
		char[] array = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(char chr:array) {
			stack.push(chr);
			if(chr == ' ') {
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
			}
		}
		
		if(!stack.isEmpty()) {
			System.out.print(' ');
			while(!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
		}
		
	}
	
}
