package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInAnArray {
    static void main() {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        System.out.println(kthSmallest(arr,k));
    }
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
        for (int j : arr) {
            maxh.add(j);
            if (maxh.size() > k) {
                maxh.poll();
            }
        }
        return maxh.peek();
    }
}
