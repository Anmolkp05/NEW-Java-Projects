package BinarySearch;

public class BinarySearch {
    public static void main() {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums,9));

    }
    public static int search(int[] nums, int target) {
        //Tc = O(log2 N) as it halves after every step
        //Sc = 0(1)
//        int low = 0;
//        int high = nums.length-1;
//        while(low<=high){
//            int mid = (low+high)/2;      //mid = low+ ((high-low)/2)   as  (2low+high-low)/2
//            if(nums[mid] == target){
//                return mid;
//            }
//            else if(nums[mid]<target){
//                low = mid+1;
//            }
//            else{
//                high = mid-1;
//            }
//        }
//        return -1;

        //Recursion
        return binarySearch(nums, target, 0, nums.length - 1);


    }

    //TC = O(log2 N)
    //SC = O(log N)
    public static int binarySearch(int[] nums, int target,int low, int high){
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;      //mid = low+ ((high-low)/2)   as  (2low+high-low)/2

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, high);
        }

        return binarySearch(nums, target, low, mid - 1);


    }
}
