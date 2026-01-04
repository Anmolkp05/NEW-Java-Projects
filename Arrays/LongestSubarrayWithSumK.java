package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK
{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        System.out.println(longestSubarray(arr, k));
    }
    public static int longestSubarray(int[] arr, int k){

        /*
        //TC =O(N2)
        //SC =O(N)
        int len=0;
        for(int i =0;i<arr.length;i++){
            int sum =0;

            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];

                if(sum == k){
                    len = Math.max(len,(j-i+1));
                }
            }

        }
        return len;

        */


        /*
        //TC = O(N) as N loop and in each condition in map it takes O(1)
        //SC = O(N) We store prefix sums in HashMap  In the worst case, all prefix sums are different  So the HashMap stores at most n entries
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0 ,maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum==k){
                maxLen= Math.max(maxLen,i+1);
            }
            int rem = sum-k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            map.putIfAbsent(sum, i);    //if (!map.containsKey(sum)) {   map.put(sum, i);  }

        }

        return maxLen;

         */

        int n = arr.length;

        int maxLen = 0 ,left = 0, right = 0;
        int sum = arr[0];

        while(right < n) {

            while(left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if(sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if(right < n) sum += arr[right];
        }

        return maxLen;

    }
}
