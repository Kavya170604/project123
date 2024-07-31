package com.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String args[]) {
	//List of list of names
		List<List<String>> listOfLists=Arrays.asList(
				Arrays.asList("Reflection","Collection","Stream"),
				Arrays.asList("State","Structure","Flow"),
				Arrays.asList("Sorting","Mapping","Reduction","Stream"));
		//Create a set to hold intermediate results
		Set<String> intermediateResults=new HashSet<>();
		//Stream pipeline demonstrating various intermediate operations
		List<String> result=listOfLists.stream()
				.flatMap(List::stream)                      //flatten the list of lists into a single stream
				.filter(s->s.startsWith("S"))               //filter elements starts with 'S'
						.map(String::toUpperCase)           //transform each element to upper case
						.distinct()                         //remove duplicate elements
						.sorted()                           //Sort elements
						.peek(s->intermediateResults.add(s))//Perform an action(add to set)on each element
						.collect(Collectors.toList());      //Collect the final result into a list
		//print the intermediate results
		System.out.println("Intermediate Results:");
		intermediateResults.forEach(System.out::println);
		//print the final result
		System.out.println("Final Result:");
		result.forEach(System.out::println);
	}

}
