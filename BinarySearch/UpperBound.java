package BinarySearch;

public class UpperBound {
    static void main() {

        int[] nums = {1,2,2,3};
        UpperBound s1 = new UpperBound();
        System.out.println(s1.upperBound(nums,2));
    }
    public int upperBound(int[] nums, int x) {
        int high = nums.length-1;
        int low = 0;
        int ans = nums.length;
        while(high>=low){
            int mid = (low+high)/2;
            if(nums[mid]>x){
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
