package ArrayString;

/**
 * Created by binhtran on 11/3/16.
 */
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords2("a8** a b"));
    }

    public static String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        int j = s.length();
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                j = i;
            } else if(i == 0 || s.charAt(i - 1) == ' ') {
                if(reversed.length() != 0) {
                    reversed.append(' ');
                }
                reversed.append(s.substring(i, j));
            }
        }

        return reversed.toString();
    }

    public static String reverseWords2(String s) {
        char[] reversed = s.toCharArray();

        for(int i = 0, j = 0; j <= reversed.length; j++) {
            if(j == reversed.length || reversed[j] == ' ') {
                reverse(reversed, i, j);
                i = j + 1;
            }
        }
        reverse(reversed, 0, reversed.length);

        return new String(reversed);
    }

    public static void reverse(char[] s, int start, int end) {
        for(int i = 0; i < (end - start)/2; i++) {
            char temp = s[start + i];
            s[start + i] = s[end - i - 1];
            s[end - i - 1] = temp;
        }
    }
}
