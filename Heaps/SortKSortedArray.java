package Heaps;

import java.util.*;

public class SortKSortedArray {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(6, 5, 3, 2, 8, 10, 9);
        int k = 3;

        List<Integer> sortedArr = sortNearlySortedArray(arr, k);

        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> sortNearlySortedArray(List<Integer> arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= k && i < arr.size(); i++) {
            minHeap.add(arr.get(i));
        }

        for (int i = k + 1; i < arr.size(); i++) {
            result.add(minHeap.poll());
            minHeap.add(arr.get(i));
        }

        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        return result;
    }
}
