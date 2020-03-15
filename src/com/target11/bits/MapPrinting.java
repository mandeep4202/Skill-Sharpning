package com.target11.bits;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPrinting {


    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<Integer,String>();

        map.put(2, "Saket");
        map.put(25, "Saurav");
        map.put(12, "HashMap");
        System.out.println(map.size());
        System.out.println("While Loop:");

        Set<Map.Entry<Integer,String>> entryset = map.entrySet();

        Iterator itr = entryset.iterator();

       while(itr.hasNext()){

           Map.Entry<Integer,String> entry = (Map.Entry<Integer,String>)itr.next();
           System.out.println("Using iterator key " + entry.getKey() + " : Value "+ entry.getValue());

       }



        for( Map.Entry<Integer,String> entry : entryset){

            System.out.println("key " + entry.getKey() + " : Value "+ entry.getValue());

        }





    }

}
