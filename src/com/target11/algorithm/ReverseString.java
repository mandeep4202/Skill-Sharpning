package com.target11.algorithm;

public class ReverseString {

    private static String doReverse(String input) {

        char[] charArray = input.toCharArray();
         int j = charArray.length-1;
         char temp ;
         for (int i = 0; i < charArray.length/2; i++) {

           temp = charArray[j];
           charArray[j--]= charArray[i];
           charArray[i] = temp;

        }
        return String.valueOf(charArray);
    }

    // solution using recursive method
    static String recursiveMethod(String str)
    {
        if ((null == str) || (str.length() <= 1))
        {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String input = "finding";
        String reversedInput = doReverse(input);
        System.out.println(input+ "  " + reversedInput);

    }
}
