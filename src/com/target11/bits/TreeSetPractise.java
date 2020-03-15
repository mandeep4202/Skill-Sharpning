package com.target11.bits;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetPractise {


    public static void main(String[] args) {

        TreeSet treeSetComparable = new TreeSet();

        treeSetComparable.add(new Person("Manu",11001));
        treeSetComparable.add(new Person("Tanu",11002));
        treeSetComparable.add(new Person("Kanu",11003));


        for (Object o : treeSetComparable) {

            Person p = (Person) o;

            System.out.printf ( "%-10s - %d %n",p.getName(), p.getId() );
        }

        ///////   now creating person TreeSet using comparator

        TreeSet treeSet = new TreeSet(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getName().compareTo(o1.getName()) ;
            }
        });

        treeSet.add(new Person("Manu",11001));
        treeSet.add(new Person("Tanu",11002));
        treeSet.add(new Person("Kanu",11003));


        for (Object o : treeSet) {

            Person p = (Person) o;

            System.out.printf ( "%-10s - %d %n",p.getName(), p.getId() );
        }

    }

}

