package generation;

/**
 * Created by binhtran on 10/06/2016.
 */
public class BinaryString {
    public static void main(String[] args) {
        generateBinary(3);
    }

    public static void generateBinary(int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = 0;
        }
        boolean check = false;
        while (!check) {
            for (int i = 0; i < n; i++) {
                System.out.print(x[i]);
            }
            System.out.println();
            int i = n - 1;
            while (i >= 0 && x[i] == 1) {
                i--;
            }
            if (i >= 0) {
                x[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    x[j] = 0;
                }
            } else {
                check = true;
            }
        }
    }
}