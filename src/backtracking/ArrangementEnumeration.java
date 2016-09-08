package backtracking;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;

/**
 * Created by binhtran on 12/06/2016.
 */
public class ArrangementEnumeration {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int[] x = new int[k];
        boolean[] c = new boolean[n];
        back(x, c, 5, 3, 0);
    }
    static void printArray(int[] x) {
        for(int i = 1; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.println();
    }
    static void back(int[] x,boolean[] c, int n, int k, int i) {
        for(int j = 0; j < n; j++) {
            if(!c[j]) {
                x[i] = j;
                if (i == k - 1) {
                    System.out.println(Arrays.toString(x));
                    //printArray(x);
                } else {
                    c[j] = true;
                    back(x, c, n, k, i + 1);
                    c[j] = false;
                }
            }
        }
    }
}
