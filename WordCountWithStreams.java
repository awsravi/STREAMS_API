package com.GroupingBy.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountWithStreams {

	public static void main(String[] args) {
		String str = "AA BB CC DD EE AA";
		String[] str2 = { "Ravi", "Ravi", "Kumr" };
		

		Map<String, Long> list = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// System.out.println(list);
		list.forEach((length, word) -> {
			if (word > 1) {
				System.out.println(length + " output : " + word);
			}
		});

		Map<String, Long> list2 = Arrays.stream(str2)
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
		System.out.println(list2);

		//Characters COUNT
		List<Character> lstr = new ArrayList<Character>(Arrays.asList('c', 'a', 'c','z', 'a', 'b'));

				Map<Character, Long> characterCountMap = lstr.stream().collect(Collectors.groupingBy(character -> character, 
				Collectors.counting() // Count occurrences
		));

		characterCountMap.forEach(
				(character, count) -> System.out.println("Character: " + character + ", Occurrences: " + count));
	}
		
		
	

}
