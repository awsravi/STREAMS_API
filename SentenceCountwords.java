package com.GroupingBy.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class SentenceCountwords {
	
	  public static void main(String[] args) {
	    List<String> words = Arrays.asList("I", "have", "a", "pen");

	    Map<Integer, List<String>> groupedWords = words.stream()
	        .collect(Collectors.groupingBy(String::length));

	    System.out.println(groupedWords); 
	    // Output: {1=[I, a], 4=[have], 3=[pen.]}
	  }
	}


