package com.stanrnd.tutorial;

import java.util.Stack;

public class TwoExpressionsBrackets {

	public static void main(String[] args) {
		String exp1 = "-(a+b+c)";
		String exp2 = "x-m+n-a-b-c";
		Stack<Character> stack = new Stack<>();
		int gop = -1;
		int op = -1;
		for(int i=0;i<exp1.length();i++) {
			if(exp1.charAt(i) == '-' || exp1.charAt(i) == '+') {
				op = i;
			} else if(exp1.charAt(i) == '(') {
				stack.push(exp1.charAt(i));
				if(op > 0) {
					gop = op;
				}
			} else if(exp1.charAt(i) == ')') {
				stack.pop();
			} else if(!stack.isEmpty() && stack.peek() == '(') {
				if(op > 0 && gop > 0 && exp1.charAt(op) == '+') {
					System.out.print("" + exp1.charAt(gop) + exp1.charAt(i));
				} else if(op > 0 && gop > 0 && exp1.charAt(gop) == '+') {
					System.out.print("" + exp1.charAt(op) + exp1.charAt(i));
				} else {
					System.out.print("" + '+' + exp1.charAt(i));
				}
			} else {
				System.out.print("" + exp1.charAt(op) + exp1.charAt(i));
			}
		}
		
	}

}
