package week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by binhtran on 7/25/16.
 */
public class QuickSort {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<Integer>();
        try {
            listInt = readFiletoArray("10.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int[] a = listInt.stream().mapToInt(i->i).toArray();
        //int[] a = new int[]{3, 9, 8, 4, 6, 10, 2, 5, 7, 1 };
//        quickSort(a, 0, a.length - 1);
//        System.out.println(Arrays.toString(a));
        System.out.println(quickSort(a, 0, a.length - 1));
    }

    static long quickSort(int[] a, int l, int r) {
        if (r <= l) {
            return 0;
        }
        long comp = r - l;
        int pivot = l + (r - l)/2;
        swap(a, l, pivot);
        int p = partrition(a, l, r);

        return comp + quickSort(a, l, p - 1) + quickSort(a, p + 1, r);
    }

    static int partrition(int[] a, int l, int r) {
        int p = a[l];
        int i = l + 1;
        for(int j = l + 1; j <= r; j++) {
            if(a[j] < p) {
                swap(a, i, j);
                i++;
            }
        }

        swap(a, i - 1, l);
        return i - 1;
    }

    static void swap(int a[], int i, int j)  {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static List<Integer> readFiletoArray(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Integer> lines = new ArrayList<Integer>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(Integer.parseInt(line));
        }
        bufferedReader.close();
        return lines;
    }
}
