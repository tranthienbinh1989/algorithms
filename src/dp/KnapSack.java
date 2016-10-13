package dp;

/**
 * Created by binhtran on 9/22/16.
 */
public class KnapSack {
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{2, 1, 3};
        int  W = 5;
        int b[][] = new int[wt.length + 1][W + 1];
        System.out.println(knapSack(b, wt, val, W));
        printKnap(b, wt);
    }

    static int knapSack(int [][]b, int[] w, int[] v, int cap) {
        for( int i = 0; i <= cap; i++) {
            b[0][i] = 0;
        }
        for( int i = 0; i <= w.length; i++) {
            b[i][0] = 0;
        }
        for(int i = 1; i <= w.length; i++) {
            for (int j = 1;j <= cap;j++) {
                if(w[i - 1] > j) {
                    b[i][j] = b[i-1][j];
                } else {
                    b[i][j] = max(b[i-1][j], v[i - 1] + b[i - 1][j - w[i- 1]]);
                }
            }
        }
        return b[w.length][cap];
    }

    static void printKnap(int[][] b, int [] w) {
        int n = b.length - 1;
        int k = b[0].length - 1;
        while (n > 0) {
            if(b[n][k] != b[n-1][k]) {
                System.out.println(n);
                k = k - w[n-1];
            }
            n--;
        }
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }
}
