package com.target11.java8.lymbdaexpression;

import java.util.Arrays;
import java.util.List;

public class AllinOne {

    public static void main(String[] args) {

        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        features.forEach( n -> System.out.println(n));

        features.forEach( System.out::println );

    }

}

