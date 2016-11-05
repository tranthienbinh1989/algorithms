package ArrayString;

/**
 * Created by binhtran on 11/3/16.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        int newInt = 0;
        int sign = 1;
        if(x == Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            x = -1*x;
            sign = -1;
        }
        while (x != 0) {
            int digit = x % 10;
            //check max number
            if (newInt > Integer.MAX_VALUE/10 || newInt == Integer.MAX_VALUE/10 && digit >= 8) {
                return 0;
            }
            newInt = newInt * 10 + digit;
            x = x / 10;
        }
        return sign * newInt;
    }
}