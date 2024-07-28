import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {7,7,5,5,5,8};
        int target =5 ;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] arr, int target) {
        int firstPosition = -1;
        int lastPosition = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (firstPosition == -1) {
                    firstPosition = i;
                }
                lastPosition = i;
            }
        }

        return new int[] { firstPosition, lastPosition };
    }
}





