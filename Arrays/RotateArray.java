package Arrays;

import java.util.Arrays;
public class RotateArray {
    static void main() {
        int[] nums = {1,2,3,4,5,6,7,8};

        rotate(nums,3 );

        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
//        //SC = 0(K)
        //TC = O(k) + O(n-k) + O(k) -> 0(N)
//        int n = nums.length;
//        k = k%n;
//        int[] temp = new int[k];
//        int index = 0;
//        for(int i =n-k;i<n;i++){
//            temp[index] = nums[i];
//            index++;
//        }
//        for(int i=n-k-1;i>=0;i--){
//            nums[i+k] = nums[i];
//        }
//        for(int i =0;i<k;i++){
//            nums[i] = temp[i];
//        }



        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);




    }
    public static void reverse(int[] arr, int i, int j ){
        int temp ;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
