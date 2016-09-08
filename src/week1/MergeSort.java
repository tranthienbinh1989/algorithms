package week1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by binhtran on 7/18/16.
 */
public class MergeSort {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<Integer>();
        try {
            listInt = readFiletoArray("IntegerArray.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int[] a = listInt.stream().mapToInt(i->i).toArray();
        //int[] a = new int[]{1, 5, 4, 2, 3, 6};
        int[] temp = new int[a.length];
        long inversion = mergesort(a, temp, 0, a.length - 1);
        System.out.print(inversion);
    }

    static long mergesort(int[] a, int[] temp, int low, int high) {
        long x = 0;
        long y = 0;
        long z = 0;
        if(a.length == 1) {
            return 0;
        }
        if(low < high) {
            int middle = (low + high)/2;
            x = mergesort(a, temp, low, middle);
            y = mergesort(a, temp, middle + 1, high);
            z = merge(a, temp, low, high, middle + 1);
        }

        return x + y + z;
    }

    static long merge(int[] a, int[] temp, int low, int high, int middle) {
        int count = 0;
        for(int i = low; i <= high; i++) {
            temp[i] = a[i];
        }

        int i = low;
        int j = middle;
        int k = low;
        while(i < middle && j <= high) {
            if(temp[i] < temp[j]) {
                a[k] = temp[i];
                i++;
            } else {
                count = count + (middle - i);
                a[k] = temp[j];
                j++;
            }
            k++;
        }

        while(i < middle) {
            a[k] = temp[i];
            i++;
            k++;
        }

        return count;
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
