package generation;

/**
 * Created by binhtran on 11/06/2016.
 */
public class ToHop {
    public static void main(String[] args) {
        generateChinhHop(5, 3);
    }

    static void generateChinhHop(int n, int k) {
        int[] x = new int[k];
        for(int i = 0; i < k; i++) {
            x[i] = i+1;
        }
        boolean check = false;
        while(!check) {
            for(int i = 0; i < k; i++) {
                System.out.print(x[i]);
            }
            System.out.println();
            int i = k - 1;
            while(i >= 0 && (x[i] == n - k + i + 1)) {
                i--;
            }
            if(i >= 0) {
                x[i] = x[i] + 1;
                for(int j = i + 1; j < k; j++) {
                    x[j] = x[j - 1] + 1;
                }
            } else {
                check = true;
            }
        }
    }
}
