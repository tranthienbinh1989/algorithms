package ArrayString;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by binhtran on 11/1/16.
 */
public class TwoSum3 {
    private Map<Integer, Integer> table = new HashMap<>();
    public static void main(String[] args) {
        TwoSum3 twoSum3 = new TwoSum3();
        twoSum3.add(1);
        twoSum3.add(3);
        twoSum3.add(5);
        System.out.println(twoSum3.find(4));
        System.out.println(twoSum3.find(7));
    }

    public void add(int key) {
        int count = table.containsKey(key) ? table.get(key) : 0;
        table.put(key, count + 1);
    }

    public boolean find(int target) {
        for (Map.Entry<Integer, Integer> entry: table.entrySet()) {
            int num = target - entry.getKey();
            int y = target - num;
            if(y == num) {
                if(entry.getValue() >= 2) {
                    return true;
                }
            } else if (table.containsKey(num)) {
                return true;
            }
        }
        return false;
    }
}
