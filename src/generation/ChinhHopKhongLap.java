package generation;

import java.util.Arrays;

/**
 * Created by binhtran on 12/06/2016.
 */
public class ChinhHopKhongLap {
    public static void main(String[] args) {
        sinhChinhHopKoLap(5, 3);
    }

    static void sinhChinhHopKoLap(int n, int k) {
        int[] x = new int[k];
        for (int i = 0; i < k; i++) {
            x[i] = i;
        }

        boolean check = false;
        int count = 0;
        while (!check) {
            boolean[] mark = new boolean[n];
            for (int i = 0; i < k; i++) {
                //danh dau cac phan tu da su dung
                mark[x[i]] = Boolean.TRUE;
            }
            count++;
            System.out.print(Arrays.toString(x));
            System.out.println();

            int i = k - 1;
            boolean flag = false;
            while (i >= 0) {
                //release current element
                mark[x[i]] = Boolean.FALSE;
                for (int j = x[i] + 1; j < n; j++) {
                    if (!mark[j]) {
                        x[i++] = j;
                        //mark as used
                        mark[j] = Boolean.TRUE;

                        for (int m = 0; m < n && i < k; m++) {
                            if (!mark[m]) {
                                x[i++] = m;
                            }
                        }
                        flag = true;
                        break;
                    }
                }
                if(flag) {
                    break;
                }
                i--;
            }
            if(!flag) {
                check = true;
            }
        }
        System.out.println(count);
    }
}
