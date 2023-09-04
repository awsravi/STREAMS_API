package com.GroupingBy.String;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {
	public static void main(String[] args) {
		String str = "11761234*ALL*ALL";
		List<String> list = Arrays.asList(str.split("\\*"));
		Map<String, Long> strfrequency = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(strfrequency);

	}
}
