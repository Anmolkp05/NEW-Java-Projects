package Arrays;

import java.util.Arrays;
public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 6};
        System.out.println("The largest element is: " + largest(array));
    }
    public static int largest(int[] arr) {

        /*
        //TC  = 0(NlogN )
        //sc = 0(logn)
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-1];

         */


        //TC = 0(n)
        //TC = 0(1)
        int largest = arr[0];  // 0 bhi de skta hai but hum yaha arr[0] dedia hai because hmko pta hai jitna v largest hoga rhega array se hi to ya to ye bara hoga ya koi or ism s hi to islie bs
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            largest = arr[i];  }
    }

        return largest;


    }
}
