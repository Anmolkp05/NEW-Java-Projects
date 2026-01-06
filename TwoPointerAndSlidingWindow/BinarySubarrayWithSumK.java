package TwoPointerAndSlidingWindow;

import java.util.*;

public class BinarySubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(numSubarraysWithSum(arr, k));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {

        /*

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

        return count; */


        Map<Integer, Integer> prefixSumCount = new HashMap<>();

        int count = 0, sum = 0;

        prefixSumCount.put(0, 1);

        for (int num : nums) {
            sum += num;

            if (prefixSumCount.containsKey(sum - goal)) {
                count += prefixSumCount.get(sum - goal);
            }

            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;




        /*
            return atMost(nums, goal) - atMost(nums, goal - 1);
        }


        public static int atMost(int[] nums, int k) {
            if (k < 0) return 0;

            int left = 0;
            int sum = 0;
            int count = 0;

            for (int right = 0; right < nums.length; right++) {  // while(right<n)
                sum += nums[right];

                while (sum > k) {
                    sum -= nums[left];
                    left++;
                }
                count += (right - left + 1);
            }

            return count;
            }

         */


        }
    }




