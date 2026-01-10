package Arrays;



import java.util.Arrays;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {

        int[] arr = {1,0,1};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {



        /*
        //TC = 0(NlogN+N)
        //SC = 0(logN)

        int n = arr.length;
        Arrays.sort(arr);
        int secondLargest = -1;
        int largest = arr[n-1];

        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                secondLargest = arr[i];
                break;
            }
        }

        return secondLargest;

         */

        /*

        //TC = 0(2N)
        //SC = (1)
        int largest = arr[0];  // 0 bhi de skta hai but hum yaha arr[0] dedia hai because hmko pta hai jitna v largest hoga rhega array se hi to ya to ye bara hoga ya koi or ism s hi to islie bs
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int secLargest = -1;
        for(int j = 0; j < arr.length; j++) {
            if (arr[j] > secLargest && arr[j] < largest) {
                secLargest = arr[j];
            }

        }


        return  secLargest;

         */
        int largest = arr[0];
        int secLargest = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i]>secLargest) {
                secLargest = arr[i];

            }
        }
        return secLargest;
    }
}
