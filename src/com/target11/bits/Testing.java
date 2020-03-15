package com.target11.bits;

import java.util.Arrays;

public class Testing {

    public static void main(String[] args) {

        int[] a = new int[4];
        Arrays.fill(a,0);
        System.out.println( a[2]++ );
        System.out.println( a[3]+1 );


        int[] ar = { 3, 2, 1, 3};

        int count = 0;
        for( int i = 0 ; i < ar.length ; i++   ){

            if(ar[i] == 3){
                System.out.println( "Count 123 "+ count);
                count += count;
            }

        }
        System.out.println( "Count "+ count);

        String s= "07:05:45PM";
         s= s.replaceAll("PM","");
        s= s.replaceAll("AM","");
        String[] div = s.split(":");

        System.out.println(" div  "+div[0]);
        Arrays.toString(div);
        int i = Integer.parseInt(div[0])  + 12;
        System.out.println(" I "+ i);
        div[0] = String.valueOf(i);
        System.out.println(Arrays.toString(div));

        StringBuilder builder = new StringBuilder();
        for(String s1 : div) {
            if(builder.length()==0)
        builder.append(s1) ;
        else
            builder.append( ":"+s1) ;
        }



        String str = builder.toString();
        System.out.println("str "+ str);

        s.toCharArray();
    }


}
