package ArrayString;

import java.util.Arrays;

/**
 * Created by binhtran on 10/13/16.
 */
public class TwoSumSorted {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumSorted(nums, target)));
    }
    static int[] twoSumSorted(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if(sum < target) {
                i++;
            } else if(sum > target) {
                j--;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
