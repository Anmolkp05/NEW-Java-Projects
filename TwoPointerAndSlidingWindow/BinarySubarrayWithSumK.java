package TwoPointerAndSlidingWindow;

public class BinarySubarrayWithSumK {
    public static void main(String[] args) {


        int[] arr = {1, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(numSubarraysWithSum(arr,k));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {


        int count = 0;

        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;

            for (int end = start; end < nums.length; ++end) {
                sum += nums[end];

                if (sum == goal) {
                    count++;
                }
            }
        }

        return count;
    }

}
