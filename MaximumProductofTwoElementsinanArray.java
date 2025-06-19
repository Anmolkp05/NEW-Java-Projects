import java.util.Arrays;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};

        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int firstMax = nums[nums.length - 1];
        int secondMax = nums[nums.length - 2];
        int result = (firstMax - 1) * (secondMax - 1);
        return result;
    }
}


