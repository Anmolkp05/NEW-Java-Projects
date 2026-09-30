package BinarySearch;

public class SearchInsertPosition {
    static void main() {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,7));

    }
    public static int searchInsert(int[] arr, int target) {
        int high = arr.length-1;
        int low = 0;
        int ans = arr.length;
        while(high>=low){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;


    }
}
