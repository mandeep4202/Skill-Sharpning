package com.target11.algorithm;

import java.util.Arrays;

public class TImeConversion {

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] a = s.split(":");

        int hh = Integer.parseInt(a[0]);
        String amPm = (a[2]).substring(2, 3);

        if (hh == 12 && amPm.equals("A")) {
            a[0] = "00";
        } else if (hh < 12 && amPm.equals("P")) {
            a[0] = (hh + 12) + "";
        }


        a[2] = a[2].substring(0, 2);
        System.out.println(Arrays.toString(a));
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            st.append(a[i]);
            if (i < a.length - 1)
                st.append(":");
        }
        System.out.println(st.toString());
        return st.toString();
    }

    public static void main(String[] args) {
        timeConversion("1:05:45PM");
        //12:40:22AM
        //07:05:45AM
    }

}
