package backtracking;

import java.util.Arrays;

/**
 * Created by binhtran on 12/06/2016.
 */
public class BinaryStringEnumeration {
    public static void main(String[] args) {
        int[] x = new int[3];
        back(x, 0);
    }

    static void back(int[] x, int i) {
        for(int j = 0; j <= 1; j++) {
            x[i] = j;
            if(i == x.length - 1) {
                System.out.println(Arrays.toString(x));
            } else {
                back(x, i + 1);
            }
        }
    }
}
