package BinarySearch;

import java.util.*;
public class FloorAndCeilnSortedArray {
    static void main() {
        int[] nums = {3, 4, 4, 7, 8, 10};
        System.out.println(Arrays.toString(getFloorAndCeil(nums,5)));
    }

    //TC = 0(log2N)+ 0(log2N) -> 0(2Log2N)) -> 0(log2N)
    //sc = 0(1)
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int first = -1;
        int last = -1;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                first = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= x) {
                last = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }



        return new int[]{last, first};
    }
}
