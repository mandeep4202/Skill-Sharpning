package com.target11.bits;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList();
        list.add(0,0);
        list.add(1,0);
        System.out.println(list.size());
        for(int i = 0 ; i < a.size(); i++ )
        {

            if(a.get(i) > b.get(i)){
                list.set(0,list.get(0)+1);
            }else if(a.get(i) < b.get(i))
                list.set(1,list.get(1)+1);
        }
        System.out.println(list.size());
        return list;
    }

    public static void main(String[] args) throws IOException {
      //int[] a ={5, 6, 7};
       // int[] b ={3, 6, 10};

        List<Integer> a = new ArrayList();

        List<Integer> b = new ArrayList();
        a.add(5);
        a.add(6);
        a.add(7);

        b.add(3);
        b.add(6);
        b.add(10);


       List<Integer> abc=  compareTriplets(a,b);
        System.out.println(abc);
    }
}
