public class FrogJumpWithKDistance {

    public static int frogJumpWithKDistance(int[] heights, int k) {
        int n = heights.length;
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int minCost = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int cost = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                    minCost = Math.min(minCost, cost);
                }
            }

            dp[i] = minCost;
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] heights = {10, 30, 40, 50, 20};
        int k = 3;
        System.out.println("Minimum energy: " + frogJumpWithKDistance(heights, k));
    }
}
