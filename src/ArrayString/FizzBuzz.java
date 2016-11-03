package ArrayString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by binhtran on 11/1/16.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        List<String> out = new ArrayList<String>();
        int n = 15;
        for(int i = 1; i <= n; i++) {
            if(i%15 == 0) {
                out.add("FizzBuzz");
            } else if(i%3 == 0) {
                out.add("Fizz");
            } else if(i%5 == 0) {
                out.add("Buzz");
            } else {
                out.add(Integer.toString(i));
            }
        }

        System.out.println(out.toString());
    }
}
