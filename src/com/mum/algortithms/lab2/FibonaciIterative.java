package com.mum.algortithms.lab2;

/**
 * Created by binhtran on 9/8/16.
 */
public class FibonaciIterative {
    public static void main(String[] args) {
        System.out.print(fibonaci(6));
    }

    static int fibonaci(int n) {
        int f0 = 0;
        int f1 = 1;
        if(n == 0) {
            return f0;
        }
        if(n == 1) {
            return f1;
        }
        int fn = 0;
        for(int i = 2; i <= n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
}
