package ArrayString;

/**
 * Created by binhtran on 11/3/16.
 */
public class StringToInteger {
    public static final int intMaxDiv10 = Integer.MAX_VALUE/10;
    public static void main(String[] args) {
        System.out.println(atoi("2147483648"));
    }

    public static int atoi(String s) {
        int sign = 1;
        int i = 0;
        while(s.charAt(i) == ' ') {
            i++;
        }

        if(s.charAt(i) == '+') {
            sign = 1;
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        int num = 0;

        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = Character.getNumericValue(s.charAt(i));
            if(num > intMaxDiv10 || num == intMaxDiv10 && digit >= 8 ) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num*10 + digit;
            i++;
        }

        return sign*num;
    }
}
