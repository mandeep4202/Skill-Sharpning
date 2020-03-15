package com.target11.java8.lymbdaexpression;

import java.util.Arrays;
import java.util.List;

public class Demo4_StaticMethodReference{
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Method reference
        list.forEach(Demo4_StaticMethodReference::print);
        // Lambda expression
        list.forEach(number -> Demo4_StaticMethodReference.print(number));
        // normal
        for(int number : list) {
        	Demo4_StaticMethodReference.print(number);
        }
    }
    public static void print(final int number) {
        System.out.println("I am printing: " + number);
    }
}