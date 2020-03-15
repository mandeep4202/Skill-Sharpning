package com.target11.java8.lymbdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo5_ParticularInstanceMethodReference {
    public static void main(String args[]) {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final MyComparator myComparator = new MyComparator();
        // Method reference
        Collections.sort(list, myComparator::compare);
        // Lambda expression
        Collections.sort(list, (a,b) -> myComparator.compare(a,b));
        list.forEach((n)->{System.out.println(n);});
        list.forEach(System.out::println);
    }
    private static class MyComparator {
        public int compare(final Integer a, final Integer b) {
            return a.compareTo(b);
        }
    }
}