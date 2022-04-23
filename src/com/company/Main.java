package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Set<Integer> set2=new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        Set<Integer>result = Def(set,set2);
        for (Integer s :result) {
            System.out.println(s);
        }
        // write your code here

    }

    private static Set<Integer> Def(Set<Integer> set, Set<Integer> set2) {
        Set<Integer> set=new HashSet<>(set1);
        set.addAll(set2);
        Set<Integer> b=new HashSet<>(set);
        b.retainAll(set2);
        set.remove(b);
        return set;
    }

}
