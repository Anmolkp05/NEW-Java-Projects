public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        } System.out.println();

        int[] arr1 = {6, 7, 8 ,5, 9, 10};
        reverse1(arr1, 0, arr1.length/2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }

   public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }



    public static void reverse1(int[] arr, int start, int middle) {
        if (start >= middle) {
            return;
        }
        int end = arr.length-1-start;           // [1,2,3,4] yha pe 1 se 4 ko 2 se 3 ko hi to swap krna hai and uska ek relation hai that start wala is related by {last = N-i-1}

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse1(arr, start + 1, middle);
    }
}
