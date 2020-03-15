package com.target11.bits;

import java.lang.reflect.Method;

public class GenericPrinter {

   /* <T> void printArray(T[] elements){
        for (T element : elements){
            System.out.println(element);
        }
    }*/

   <E> void printArray(E[] elements){

       for( E element : elements){
           System.out.println(element);
       }

   }

    public static void main( String args[] ) {
        GenericPrinter myPrinter = new GenericPrinter();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : GenericPrinter.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
