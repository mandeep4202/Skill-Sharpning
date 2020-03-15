package com.target11.java8.lymbdaexpression;

import java.util.Arrays;
import java.util.List;

public class Demo2_MethodRef {

	public static void main(String[] args) {
		//Prior Java 8 : 
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
		for (String feature : features) { 
			System.out.println(feature); 
			} 
		//In Java 8: 
		List<String> features2 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
		features2.forEach(n -> System.out.println(n)); 
		// Even better use Method reference feature of Java 8 // method reference is denoted by :: (double colon) operator 
		// looks similar to score resolution operator of C++ 
		features2.forEach(System.out::println);

		
	}
}
