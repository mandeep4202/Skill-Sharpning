package com.target11.java8.lymbdaexpression;

import java.util.Arrays;
import java.util.List;

public class Demo7_ArbitraryInstanceMethodReference {
    public static void main(String args[]) {
        final List<Person> people = Arrays.asList(new Person("dan"), new Person("laura"));
        // Method reference
        people.forEach(Person::printName);
        // Lambda expression
        people.forEach(person -> person.printName());
        // normal
        for (final Person person : people) {
            person.printName();
        }
    }
    private static class Person {
        private String name;
        public Person(final String name) {
            this.name = name;
        }
        public void printName() {
            System.out.println(name);
        }
    }
}