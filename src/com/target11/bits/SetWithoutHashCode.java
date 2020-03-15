package com.target11.bits;

import java.util.HashSet;
import java.util.Set;

public class SetWithoutHashCode {

    public static void main(String[] args) {

        Set<Person> set = new HashSet<>();
        set.add(new Person("Manu", 11001));
        set.add(new Person("Manu", 11001));
        set.add(new Person("Manu", 11001));
        set.add(new Person("Tanu", 11002));
        set.add(new Person("Kanu", 11003));

        for (Person p : set) {
            System.out.printf ( "%-10s - %d %n",p.getName(), p.getId() );
        }
    }

}
