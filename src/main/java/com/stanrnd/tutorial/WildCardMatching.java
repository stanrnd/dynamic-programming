package com.stanrnd.tutorial;

public class WildCardMatching {
	
	public static void main(String[] args) {
		String str = "baaababa";
		String patternStr = "b*ab";
		
		
		System.out.println(match(str, patternStr));
		
	}
	
	private static boolean match(String str, String patternStr) {
		char[] chars = str.toCharArray();
		char[] pattern = patternStr.toCharArray();
		int start = 0;
		int i=0;
		int j=0;
		while(i<pattern.length && j < chars.length) {
			if(pattern[i] == '*') {
				++i;
				start = i;
			} else if(pattern[i] == '?' || pattern[i] == chars[j]) {
				++i;
				++j;
			} else {
				if(i == 0) {
					break;
				}
				i = start;
				++j;
			}
		}
		
		return i == pattern.length;
	}

}
