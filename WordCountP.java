package com.GroupingBy.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountP {
	public static void main(String[] args) {
		String str = "this is ravi this is kumar";

		List<String> sList = Arrays.asList(str.split(" "));
		Map<String, Long> out = sList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(out);

		HashMap<String, Integer> hm = new HashMap<>();
		
		String[] words = str.split(" ");

		for (String word : words) {

			if (hm.containsKey(word)) {
				hm.put(word, hm.get(word) + 1);
			} else {

				hm.put(word, 1);
			}
		}
		for (String word : hm.keySet()) {
			System.out.println(word + ": " + hm.get(word));
		}
	}
}
