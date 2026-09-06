package Arrays;

import java.util.Arrays;
public class RotateArrayByOneRight {
    static void main() {
        int[] arr = {2,3,4,5,6};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr) {
        int last = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1] = arr[i];

        }
        arr[0] = last;

    }
}
