package BinarySearch;

public class CeilInSortedArray {
    static void main() {

        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        System.out.println(findCeil(arr,5));
    }
    public static int findCeil(int[] arr, int x) {
        int low =0;
        int high = arr.length-1;
        int first = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=x){
                first = mid;
                high = mid-1;
            }
            else {
                low = mid+1;

            }
        }
        return first;

    }
}
