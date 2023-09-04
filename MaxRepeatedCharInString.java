package com.GroupingBy.String;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxRepeatedCharInString {
	public static void main(String[] args) {

		String str = "abcadccabcdakc";

		Map<String, Long> lstr=Arrays.asList(str.split(""))
				.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Entry<String, Long> out=lstr.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue())
		.get();
		
		System.out.println("Max repeated char: " +out);
		
		
		
	}
}
