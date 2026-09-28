package Arrays;

import java.util.Arrays;

public class LeftRotateAnArrayByKPlaces {
    static void main() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        rotate(nums, 3);

        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {   //right rotation
        //SC = 0(K)
        //TC = O(k) + O(n-k) + O(k) -> 0(N)
//        int n = nums.length;
//        k = k%n;
//        int[] temp = new int[k];
//
//        for(int i=0;i<k;i++){
//            temp[i] = nums[i];
//        }
//
//        for(int i=k;i<n ;i++){
//            nums[i-k] = nums[i];
//        }
//
//        for(int i = 0;i<temp.length;i++){
//            nums[n-k+i]= temp[i];
//        }
      //Tc = 0(N)
        //sc = 0(1)
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);



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
