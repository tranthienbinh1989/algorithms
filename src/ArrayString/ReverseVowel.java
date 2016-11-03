package ArrayString;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by binhtran on 11/2/16.
 */
public class ReverseVowel {
    public static void main(String[] args) {
        System.out.println(reverseVowels("a."));
    }

    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";

        char[] newString = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            while (i < j && vowels.indexOf(newString[i]) == -1) {
                newString[i] = s.charAt(i);
                i++;
            }
            while (i < j && vowels.indexOf(newString[j]) == -1) {
                newString[j] = s.charAt(j);
                j--;
            }

            char temp = newString[i];
            newString[i] = newString[j];
            newString[j] = temp;
            i++;
            j--;
        }

        return new String(newString);
    }
}
