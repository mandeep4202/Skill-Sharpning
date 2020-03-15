package com.target11.java8.lymbdaexpression;

public class Demo3MethodRef {
	
	

	   public static void main(String[] args) {
	      // Using lambda expression
	      Predicate predicate1 = (n) -> EvenOddCheck.isEven(n);
	      System.out.println(predicate1.test(20));

	      // Using method reference
	      Predicate predicate2 = EvenOddCheck::isEven;
	      System.out.println(predicate2.test(25));
	   }
	

}

/*
 * Functional Interface
 */
interface Predicate {
   boolean test(int n);
}

class EvenOddCheck {
   public static boolean isEven(int n) {
      return n % 2 == 0;
   }
}

