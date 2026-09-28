package Arrays;

public class LinearSearch {
    static void main() {
        int[] nums = {2,3,4,5,3};
        System.out.println(linearSearch(nums,3));
    }
    public static int linearSearch(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;

    }

}
