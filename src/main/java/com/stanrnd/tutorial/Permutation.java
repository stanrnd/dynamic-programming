package com.stanrnd.tutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Permutation {
	
	static Set<String> r = new HashSet<>();

	private static void find(List<Character> chars, String result) {
		r.add(result);
		System.out.println(result);

		for (int i = 0; i < chars.size(); i++) {
			List<Character> tempChars = new ArrayList<>(chars);
			tempChars.remove(i);
			find(tempChars, result + chars.get(i));
		}

	}

	public static void main(String[] args) {
		String str = "abcd";
		find(str.chars().mapToObj(c -> (char) c).collect(Collectors.toList()), "");
		
		System.out.println(r.size());
	}

}
