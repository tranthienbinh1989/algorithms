package ArrayString;

/**
 * Created by binhtran on 11/3/16.
 */
public class Strstr {
    public static void main(String[] args) {
        System.out.println(strstr2("aaaab", "abc"));
    }

    public static int strstr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for( int j = 0; ; j++) {
                if(j == needle.length()) return i;
                if(i + j == haystack.length())  return -1;
                if(haystack.charAt(i + j) != needle.charAt(j)) break;
            }
        }
    }

    public static int strstr2(String haystack, String needle) {
        if(needle.equals("")) return 0;
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)) return i;
        }
        return -1;
    }
}
