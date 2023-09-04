package com.GroupingBy.String;

import java.util.*;
import java.util.stream.Collectors;

public class OcceranceOfCharcount {

	public static void main(String[] args) {
		List<Character> str = new ArrayList<>(Arrays.asList('c', 'a', 'c', 'z', 'a', 'b'));

		Map<Character, Long> characterCountMap = str.stream().collect(Collectors.groupingBy(character -> character, 
				Collectors.counting() // Count occurrences
		));

		characterCountMap.forEach(
				(character, count) -> System.out.println("Character: " + character + ", Occurrences: " + count));
	}
}
