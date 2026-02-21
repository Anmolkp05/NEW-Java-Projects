package GreedyAlgo;

import java.util.*;
public class MinimumCoins {
    static void main() {
        int[] coins = {1, 2, 5};
        int amount = 11;
       // System.out.println(coinChange(coins, amount));
        System.out.println(minimumElements(coins, amount));

    }
    /*
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -2);

         return helper(coins, amount, dp);
    }

    private static int helper(int[] coins, int rem, int[] dp) {
        if (rem == 0) return 0;

        if (rem < 0) return -1;

        if (dp[rem] != -2) return dp[rem];

        int mini = Integer.MAX_VALUE;

        for (int coin : coins) {
            int res = helper(coins, rem - coin, dp);

             if (res >= 0 && res < mini)
                mini = 1 + res;
        }

        dp[rem] = (mini == Integer.MAX_VALUE) ? -1 : mini;
        return dp[rem];
    }

     */
    /*
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        // Base case: dp[0] = 0
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

     */
    public static int minimumElements(int[] arr, int amount) {
        int n = arr.length;

        int[] prev = new int[amount + 1];
        int[] cur = new int[amount + 1];

        for (int i = 0; i <= amount; i++) {
            if (i % arr[0] == 0)
                prev[i] = i / arr[0];
            else
                prev[i] = (int) 1e9;
        }


        for (int ind = 1; ind < n; ind++) {
            for (int target = 0; target <= amount; target++) {

                int notTake = prev[target];

                int take = (int) 1e9;
                if (arr[ind] <= target)
                    take = 1 + cur[target - arr[ind]];

                cur[target] = Math.min(notTake, take);
            }

            prev = cur.clone();
        }

        int ans = prev[amount];
        if (ans >= 1e9)
            return -1;
        return ans;
    }

}
