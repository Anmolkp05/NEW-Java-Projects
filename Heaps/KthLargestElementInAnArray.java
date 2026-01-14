package Heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
    public static int findKthLargest(int[] nums, int k) {
    /*
        //TC = 0(NlogN)
        //sc = 0(1)
        Arrays.sort(nums);

        return nums[nums.length - k];

     */
        //TC = O(n log k)
        //SC = O(k)

        PriorityQueue<Integer> minh = new PriorityQueue<>();
        for (int num: nums) {
            minh.add(num);
            if (minh.size() > k) {
                minh.remove();
            }
        }

        return minh.peek();

    }
}
