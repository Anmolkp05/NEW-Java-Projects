package TwoPointerAndSlidingWindow;
import java.util.Arrays;
public class SquareofaSortedArray {
    static void main() {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = nums[i]*nums[i];
        }
        int l =0;
        int r = n-1;
        int index = n-1;
        while(l<=r){
            if(nums[l]<=nums[r]){
                arr[index] = nums[r];
                r--;
            }
            else{
                arr[index] = nums[l];
                l++;

            }
            index--;
        }


        return arr;
    }

}
