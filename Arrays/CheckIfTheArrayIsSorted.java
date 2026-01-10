package Arrays;

public class CheckIfTheArrayIsSorted {
    static void main() {
        int[] arr = {3,4,5,6,7};
         System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
