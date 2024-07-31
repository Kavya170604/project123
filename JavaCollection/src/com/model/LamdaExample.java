package com.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class LamdaExample {

	public static void main(String args[]) {
		List<String> li=Arrays.asList("Karur","Chennai","Coimbatore");
		/*
		 * //old way to retrieve data
		for(String s:li) {
			System.out.println(s);
		}
		//new way 1
		li.forEach(s ->System.out.println(s));
		//new way 2(method call)
		li.forEach(System.out::println);
		*/
		//starts with c
		li.stream()
		.filter(s->s.startsWith("C"))
		.map(s->s.toUpperCase())//convert to UpperCase
		.forEach(System.out::println);
		
		
	}
}
