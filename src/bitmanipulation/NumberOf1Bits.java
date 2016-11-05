package bitmanipulation;

/**
 * Created by binhtran on 11/3/16.
 */
public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(getBit(33, 11));
    }

    public static int count1Bits(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if(getBit(i, n)) {
                count++;
            }
        }
        return count;
    }

    //get ith bit of number n
    static boolean getBit(int i, int n) {
        return (n & (1<<i)) != 0;
    }
}
