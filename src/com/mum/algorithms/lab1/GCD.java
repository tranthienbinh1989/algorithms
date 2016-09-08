package com.mum.algorithms.lab1;

/**
 * Created by binhtran on 9/6/16.
 */
public class GCD {
    public static void main(String []args) {
        System.out.println(gcd(6, 9));
    }

    static int gcd(int n, int m) {
        if(m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }
}
