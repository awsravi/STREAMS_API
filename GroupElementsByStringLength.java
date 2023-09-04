package com.GroupingBy.String;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupElementsByStringLength {
	public static void main(String[] args) {

		List<String> ls = Arrays.asList("banana", "mango", "sapota", "grape", "tata");
		
		Map<Integer, String> gEBSL = ls.stream().collect(
				Collectors.groupingBy(String::length, Collectors.mapping(s -> s, Collectors.joining(", ", "[", "]"))));
		System.out.println(gEBSL);
			
		
		  gEBSL.forEach((length,word) -> {System.out.println(length +" - "+word); });
		 
	}
}














