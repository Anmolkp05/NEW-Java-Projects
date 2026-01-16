package Heaps;

import java.util.*;
public class ConvertMinHeapToMaxHeap {
    static void main() {
        int[] minHeap = {1, 3, 5, 7, 9, 11};
        int n = minHeap.length;

        convertMinToMaxHeap(minHeap);

        System.out.println(Arrays.toString(minHeap));


    }
    static void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            maxHeapify(arr, n, largest);
        }
    }

    static void convertMinToMaxHeap(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }
}
