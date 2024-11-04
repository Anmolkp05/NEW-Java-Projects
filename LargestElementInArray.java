public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 6};
        System.out.println("The largest element is: " + largest(array));
    }
    public static int largest(int[] arr) {
    int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            largest = arr[i];  }
    }

        return largest;
    }
}
