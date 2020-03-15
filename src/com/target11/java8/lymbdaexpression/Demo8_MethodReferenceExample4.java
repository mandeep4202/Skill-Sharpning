package com.target11.java8.lymbdaexpression;

import java.util.function.BiConsumer;


class MathOperations {
   public MathOperations(int a, int b) {
      System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
   }
}

public class Demo8_MethodReferenceExample4 {

   public static void main(String[] args) {

      System.out.println("------------Using lambda expression------------");
      BiConsumer<Integer, Integer> addtion1 = (a, b) -> new MathOperations(a, b);
      addtion1.accept(10, 20);
      
      System.out.println("\n------------Using method reference------------");
      BiConsumer<Integer, Integer> addtion2 = MathOperations::new;
      addtion2.accept(50, 20);
   }
}
