package com.GroupingBy.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCountGT {
	public static void main(String[] args) {

		List<String> str = Arrays.asList("aa", "bb", "cc", "aa", "dd", "dd");

		
		//Using String method 
		Map<String, Long> wordcount = str.stream()
				.collect(Collectors.groupingBy(String::toString, Collectors.counting()));
		System.out.println("Using String method COUNT " +wordcount);
		
		
		//More than 2 same strings
		wordcount.forEach((word, count) -> {
			if (count >= 2) {
				System.out.println(" More than 2 same strings :"+word + ":" + count);
			}
		});

		
		//Using Function
		Map<String, Long> occ = str.stream().sorted()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(" Using Function COUNT:"+occ);
		
		
		////More than 2 same strings
		occ.forEach((word, count) -> {
			if (count >= 2) {
				System.out.println(" More than 2 same strings :"+word + ":" + count);
			}
		});

	}
}