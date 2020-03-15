package com.target11.algorithm;

import java.util.List;

public class GivingGrace {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int grade = 0;
        for(int i=0; i < grades.size(); i++){
            grade = grades.get(i);
            if(grade < 38){

            }else{

                int multiple =  (grade+5)/5;
                int diffrence = (multiple*5)- grade;
                if(diffrence < 3 ){
                    grades.set(i, new Integer(grades.get(i) + diffrence));
                }
            }
        }
        return grades;
    }


    public static void main(String[] args) {

    }


}
