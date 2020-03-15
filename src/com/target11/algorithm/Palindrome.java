package com.target11.algorithm;

public class Palindrome {
    private static boolean palindromeVerification(String input) {
   boolean isPalindrome = true;
        char[] charArray = input.toCharArray();
        int j = charArray.length-1;

        for (int i = 0; i < charArray.length/2; i++) {

           if( charArray[i] != charArray[j--] ){
               isPalindrome = false;
           }
        }
        return isPalindrome;
    }


    public static void main(String[] args) {
        String input = "MADAM";
        boolean isPalindrome = palindromeVerification(input);
        System.out.println("isPalindrome "+  isPalindrome);

    }
}
