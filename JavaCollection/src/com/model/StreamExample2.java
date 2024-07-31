package com.model;

import java.util.Arrays;
import java.util.List;

//dispaly prices+12% GST in console
public class StreamExample2 {
public static void main(String args[]) {
	List<Integer> prices=Arrays.asList(100,200,300,400,500);
	//old way
	for(Integer s:prices) {
		Double d=s+(s*0.12);
		System.out.println(d);
	}
	//new way
	prices.stream().map(p->p+.12*p)
	   .forEach(System.out::println);
}
	

}
