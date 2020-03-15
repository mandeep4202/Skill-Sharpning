package com.target11.bits;

public class Armstrong {

    private boolean checkArmStrong(int number){

        int result = 0;
        int cube = 1;

        for(int i = number ;i > 0; i = i/10){

           int a = i%10;
            cube = a*a*a;
            result = result + cube;
        }

        return result == number ? true : false;

    }

    public static void main(String[] args) {

       boolean isArmStrong = new Armstrong().checkArmStrong(1532);

        System.out.println(isArmStrong);

    }

}
