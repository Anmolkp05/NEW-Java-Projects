package TwoPointerAndSlidingWindow;

import java.util.*;

public class SubarraysWithKDifferentIntegers {
     static void main() {
        int[] nums = {1, 2, 1, 2, 3};
        int k  = 2;
        System.out.println(subarraysWithKDistinct(nums,k));
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {


        /*

        //TC = (N2)
        //SC = (N)
        int count=0;
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=i;j<nums.length;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if (map.size() == k)
                    count++;

                if (map.size() > k)
                    break;
            }
        }
        return count;


*/

      /*
       //sab same hi hai but ye constraints ke hisab se array se v ho jayega islie array se v kiya for faster runtime
        int count = 0;

        int maxVal = 0;
        for (int num : nums) {
            if (num > maxVal) maxVal = num;
        }

        for (int i = 0; i < n; i++) {
            int[] freq = new int[maxVal + 1];
            int distinct = 0;

            for (int j = i; j < n; j++) {
                int idx = nums[j];
                if (freq[idx] == 0) distinct++;
                freq[idx]++;

                if (distinct == k) count++;
                if (distinct > k) break;
            }
        }

        return count;


       */



 /*
                                                    //BEST ONE
        //TC = 0(N)  - each element is added/removed at most once.
        //SC=(K)  - max element in nums
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    public static int atMost(int[] nums, int k) {
        if (k < 0) return 0;

        int left = 0;
        int count = 0;
        int right = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        while(right<nums.length){  //for (int right = 0; right < nums.length; right++)
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            count += (right - left + 1);
            right++;
        }

        return count;
        }

  */

        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static int atMost(int[] nums, int k) {
        if (k < 0) return 0;

        int maxVal = 0;
        for (int num : nums) {
            if (num > maxVal) maxVal = num;
        }

        int[] freq = new int[maxVal + 1];

        int left = 0, count = 0, distinct = 0;

        for (int right = 0; right < nums.length; right++) {
            int idx = nums[right];
            if (freq[idx] == 0) distinct++;
            freq[idx]++;

            while (distinct > k) {
                int leftIdx = nums[left];
                freq[leftIdx]--;
                if (freq[leftIdx] == 0) distinct--;
                left++;
            }

            count += (right - left + 1);
        }

        return count;








    }
}
