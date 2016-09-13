package com.mum.algorithms.lab4;

import java.util.Arrays;

/**
 * Created by binhtran on 9/13/16.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] a = new int[] {9, 9, 9 ,9 , 1, 1};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void mergeSort(int a[], int left, int right) {
        if (a.length == 1) {
            return;
        }
        if(left < right) {
            int middle = (left + right)/2;
            mergeSort(a, left, middle);
            mergeSort(a, middle + 1, right);
            merge(a, left, right, middle);
        }
    }

    static void merge(int[] a, int left, int right, int middle) {
        int[] temp = new int[a.length];
        for(int i = left; i <= right; i++) {
            temp[i] = a[i];
        }
        int i = left;
        int j = middle + 1;
        int k = left;
        while (i <= middle && j <= right) {
            if(temp[i] < temp[j]) {
                a[k] = temp[i];
                i++;
            } else {
                a[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i <= middle) {
            a[k] = temp[i];
            i++;
            k++;
        }
    }
}

