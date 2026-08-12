package TwoPointerAndSlidingWindow;

import java.util.Arrays;



public class SortColors {
    static void main() {
        SortColors SC = new SortColors();
        int[] nums = {2,0,2,2,1,1,0};
        SC.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    //TC = O(2N)
    //Sc = 0(1)
//    public void sortColors(int[] nums) {
//        int Zero=0;
//        int One=0;
//        int Two=0;
//        for(int i = 0; i<nums.length; i++){
//            if(nums[i] == 0){
//                Zero++;
//            }
//            if(nums[i] == 1){
//                One++;
//            }
//            if(nums[i] == 2){
//                Two++;
//            }
//        }
//        for(int j = 0; j<Zero; j++){
//            nums[j] = 0;
//
//        }
//        for(int k = Zero; k<Zero+One; k++){
//            nums[k] = 1;
//
//        }
//        for(int l = One+Zero; l<nums.length; l++){
//            nums[l] = 2;
//
//        }
//
//    }

    public void sortColors(int[] nums) {
        int left =0;
        int mid = 0;
        int right = nums.length-1;

        while(mid<=right){
            if(nums[mid]==2){
                swap(nums,mid,right);
                right--;
            }
            else if(nums[mid]==0){
                swap(nums, mid,left);
                left++;
                mid++;

            }
            else if(nums[mid]==1){
                mid++;
            }



        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

