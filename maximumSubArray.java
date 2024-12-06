public class maximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
         int result = Subarray.maxSubArray(nums);
         System.out.println("Maximum subarray sum: " + result);
    }
}

class Subarray {
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

         for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}

