package com.GroupingBy.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class WordCountStreams {

	

	
	  public static void main(String[] args) {
	    List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

	    Map<Integer, List<String>> groupedWords = words.stream()
	        .collect(Collectors.groupingBy(String::length));

	    System.out.println(groupedWords); 
	    // Output: {3=[banana], 5=[apple], 6=[cherry], 4=[date]}
	  }
	}


