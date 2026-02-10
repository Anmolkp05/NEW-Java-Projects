package Arrays;

public class LeftRotateAnArrayByOne {
    static void main() {
        int n = 5;  // Size of the array
        int[] arr = {1, 2, 3, 4, 5};
        solve(arr,n);
    }


    public static void solve(int[] arr, int n) {
        int[] temp = new int[n];

        for(int i = 1; i < n; i++){
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();


    }

}
