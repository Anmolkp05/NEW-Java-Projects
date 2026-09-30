package BinarySearch;
import java.util.*;
public class FindFirstandLastPositionofElementinSortedArray {
    static void main() {

        int[] arr = {5,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                first = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                last = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (first == -1 || nums[first] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{first, last};
    }
}
