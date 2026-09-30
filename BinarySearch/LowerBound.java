package BinarySearch;

public class LowerBound {
    static void main() {
        int[] arr = {2,3,7,10,11,11,25};
        int target = 11;
        System.out.println(lowerBound(arr,target));
    }
    public static int lowerBound(int[] arr, int target) {
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
