package dp;

/**
 * Created by binhtran on 10/1/16.
 *
 * Longest Increasing Subsquence
 */
public class LIS {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,3};
        lengthOfLIS(nums);
    }

    static int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if (i == size) ++size;
        }
        return size;
    }
}
