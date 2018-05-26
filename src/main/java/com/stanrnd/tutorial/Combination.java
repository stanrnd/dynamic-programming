package com.stanrnd.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Combination {

	private static void find(List<Character> chars, String result) {
		System.out.println(result);

		List<Character> tempChars = new ArrayList<>(chars);
		for (int i = 0; i < chars.size(); i++) {
			tempChars.remove(i);
			find(tempChars, result + chars.get(i));
		}

	}

	public static void main(String[] args) {
		String str = "abcd";
		find(str.chars().mapToObj(c -> (char) c).collect(Collectors.toList()), "");
	}

}
