package generation;

/**
 * Created by binhtran on 11/06/2016.
 */
public class HoanVi {
    public static void main(String[] args) {
        sinhHoanVi(3);
    }

    static void sinhHoanVi(int n) {
        int[] x = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = i + 1;
        }

        boolean check = false;
        while(!check) {
            //in hoan vi
            for(int i = 0; i < n; i++) {
                System.out.print(x[i]);
            }
            System.out.println();

            //tim phan tu truoc day giam dan
            int i = n - 1;
            int min = 0;
            while (i >= 0 && x[i] > min) {
                min = x[i];
                i--;
            }

            if (i >= 0) {
                int k = n - 1;
                //tim phan dau tien trong day giam dan lon hon phan tu thu i
                while (k > i) {
                    if(x[k] > x[i]) {
                        //hoan vi k va i
                        int temp = x[k];
                        x[k] = x[i];
                        x[i] = temp;
                        break;
                    } else {
                        k--;
                    }
                }

                //sap cac phan tu giam dan thanh tang dan
                int a = i + 1;
                int b = n - 1;

                while (a < b) {
                    int temp = x[a];
                    x[a] = x[b];
                    x[b] = temp;
                    a++;
                    b--;
                }
            } else {
                check = true;
            }
        }
    }
}
