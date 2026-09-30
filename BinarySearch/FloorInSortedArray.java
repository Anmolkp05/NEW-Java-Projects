package BinarySearch;

public class FloorInSortedArray {
    static void main() {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};

        System.out.println(findFloor(arr,5));
    }
    public static int findFloor(int[] arr, int x) {
        int low =0;
        int high = arr.length-1;
        int first = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]<=x){
                first = mid;
                low = mid+1;
            }
            else {
                high = mid-1;

            }
        }
        return first;


    }
}
