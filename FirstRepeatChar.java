package com.GroupingBy.String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatChar {
	public static void main(String[] args) {

		String str = "output";

		String frc = Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(n -> n.getValue() > 1).map(n -> n.getKey()).findFirst().get();

		System.out.println("FirstRepeatChar :" + frc);

		String fnc = Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(n -> n.getValue() == 1).map(n -> n.getKey()).findFirst().get();
		System.out.println("FirstNONRepeatChar :"+fnc);


		String fnc2 = Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(n -> n.getValue() == 1).map(n -> n.getKey()).skip(1).findFirst().get();
		System.out.println("SecondNONRepeatChar :"+fnc2);

		
		String frc2 = Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(n -> n.getValue() > 1).map(n -> n.getKey()).skip(1).findFirst().get();
		System.out.println("SecondRepeatChar :" + frc2);
	}
}
