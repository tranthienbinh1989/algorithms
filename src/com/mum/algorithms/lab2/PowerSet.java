package com.mum.algorithms.lab2;

import java.util.*;

/**
 * Created by binhtran on 9/7/16.
 */
public class PowerSet {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(3);
        x.add(4);
        x.add(6);
        List<Set<Integer>> results = powerSet(x);
        for (Set<Integer> s : results) {
            System.out.println(s.toString());
        }
    }

    static List<Set<Integer>> powerSet(List<Integer> x) {
        List<Set<Integer>> p = new ArrayList<Set<Integer>>();
        Set<Integer> s = new HashSet<Integer>();
        p.add(s);

        while(!x.isEmpty()) {
            int f = x.remove(0);
            List<Set<Integer>> temp = new ArrayList<Set<Integer>>();
            Iterator<Set<Integer>> it = p.iterator();
            while(it.hasNext()) {
                Set<Integer> k = it.next();
                Set<Integer> t = new HashSet<Integer>();
                t.addAll(k);
                t.add(f);
                temp.add(t);
            }
            p.addAll(temp);
        }
        return p;
    }
}
