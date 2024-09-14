import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {-10, -10, 5, 2};
        System.out.println(maximumProduct(nums));
    }
        public static int maximumProduct(int[] nums) {
            if (nums.length < 3) {
                throw new IllegalArgumentException("Array must have at least 3 numbers");
            }

            Arrays.sort(nums);

            int n = nums.length;
            return Math.max(nums[n-1] * nums[n-2] * nums[n-3], nums[0] * nums[1] * nums[n-1]);
        }


    }


