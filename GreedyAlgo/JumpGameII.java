package GreedyAlgo;
import java.util.*;

public class JumpGameII {
    static void main() {
        int[] nums = {2, 3, 1, 1, 4};

        System.out.println("Minimum number of jumps: " + jump(nums));

    }
    /*
    public static int jump(int[] nums) {
        return minJumps(nums, 0);
    }

    public static int minJumps(int[] nums, int position) {

        // If reached or crossed last index
        if (position >= nums.length - 1) return 0;

        // If stuck at zero
        if (nums[position] == 0) return Integer.MAX_VALUE;

        int minStep = Integer.MAX_VALUE;

       for (int j = 1; j <= nums[position]; j++) {
            int result = minJumps(nums, position + j);

            if (result != Integer.MAX_VALUE) {
                minStep = Math.min(minStep, 1 + result);
            }
        }

        return minStep;
    }

     */
    public static int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= nums[i] && i + j < n; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }

        return dp[n - 1];
    }

}
