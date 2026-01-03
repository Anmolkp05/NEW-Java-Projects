package TwoPointerAndSlidingWindow;

import java.util.*;

public class CountNumberOfNiceSubArrays {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        System.out.println(numberOfSubarrays(nums,k));
    }
    public static int numberOfSubarrays(int[] nums, int k) {

      /*  int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int oddCount = 0;

            for (int end = start; end < nums.length; end++) {
                if (nums[end] % 2 != 0)
                    oddCount++;

                if (oddCount > k)
                    break;

                if (oddCount == k)
                    count++;
            }
        }

        return count;
    }

       */

        Map<Integer, Integer> freq = new HashMap<>();

        freq.put(0, 1);

        int oddCount = 0;

        int result = 0;

        for (int num : nums) {

            if (num % 2 == 1) oddCount++;

            if (freq.containsKey(oddCount - k)) {
                result += freq.get(oddCount - k);
            }

            freq.put(oddCount, freq.getOrDefault(oddCount, 0) + 1);
        }

        return result;
    }


}
