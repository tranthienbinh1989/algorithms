package generation;

/**
 * Created by binhtran on 12/06/2016.
 */
public class ChinhHop {

    public static void main(String[] args) {
        generateChinhHop(5, 3);
    }

    public static void generateChinhHop(int n, int k) {
        int[] x = new int[k];
        for (int i = 0; i < k; i++) {
            x[i] = i;
        }
        boolean check = false;
        while (!check) {
            for (int i = 0; i < k; i++) {
                System.out.print(x[i]);
            }
            System.out.println();

            int i = k - 1;
            while (i >= 0 && x[i] == n) {
                i--;
            }
            if (i >= 0) {
                x[i] = x[i] + 1;
                for (int j = i + 1; j < k; j++) {
                    x[j] = 0;
                }
            } else {
                check = true;
            }
        }
    }
}
