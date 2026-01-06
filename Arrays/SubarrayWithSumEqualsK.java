package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithSumEqualsK {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};

        int k = 6;

        System.out.println(subarraySum(arr,k));
    }
    public static int subarraySum(int[] nums, int k){
      /*
        int n = nums.length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    */
        Map<Integer, Integer> SumCount = new HashMap<>();

        int count = 0, sum = 0;

        SumCount.put(0, 1);

        for (int num : nums) {
            sum += num;

            if (SumCount.containsKey(sum - k)) {
                count += SumCount.get(sum - k);
            }

            SumCount.put(sum, SumCount.getOrDefault(sum, 0) + 1);
        }

        return count;


    }
}
