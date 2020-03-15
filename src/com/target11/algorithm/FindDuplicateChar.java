package com.target11.algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindDuplicateChar {

    private static HashMap<Character, Integer> findDuplicates(String input) {
        HashMap<Character, Integer> hs = new HashMap<>();

        char[] a = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {

          if(hs.get(a[i]) != null ){
              hs.put(a[i], hs.get(a[i]) + 1 );
          }else{
              hs.put(a[i], 1);
          }

        }

        return hs;
    }

    public static void main(String[] args) {
        String input = "findings";
        HashMap<Character,Integer> duplicateChar = findDuplicates(input);

        Set<Map.Entry<Character,Integer>> entrySet=    duplicateChar.entrySet();

        Iterator itr= entrySet.iterator();

        while (itr.hasNext()){

           Map.Entry<Character,Integer> entry  = (Map.Entry<Character, Integer>) itr.next();

           System.out.println( "Char : " +entry.getKey() +" occurred " + entry.getValue() +" Times" );
       }

    }

}
