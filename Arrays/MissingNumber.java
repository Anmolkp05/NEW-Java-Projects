package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {4,6,7,8,9,5,3,0,2,1};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

            int actualSum = (nums.length * (nums.length + 1) / 2);
            int missingNum = actualSum - sum;

            return missingNum;
        }
    }

