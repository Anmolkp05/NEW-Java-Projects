package GreedyAlgo;

import java.util.*;


public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = { {1, 2}, {2, 3}, {3, 4}, {1, 3} };
        System.out.println("Minimum intervals to remove: " + eraseOverlapIntervals(intervals));
    }
//    public static int eraseOverlapIntervals(int[][] intervals) {
//
//         int n = intervals.length;
//
//       int maxValid = 0;
//
//        for (int mask = 0; mask < (1 << n); mask++) {
//
//             List<int[]> subset = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                if ((mask & (1 << i)) != 0)
//                    subset.add(intervals[i]);
//            }
//
//            subset.sort((a, b) -> Integer.compare(a[0], b[0]));
//
//             boolean valid = true;
//            for (int i = 1; i < subset.size(); i++) {
//                if (subset.get(i)[0] < subset.get(i - 1)[1]) {
//                    valid = false;
//                    break;
//                }
//            }
//
//             if (valid)
//                maxValid = Math.max(maxValid, subset.size());
//        }
//
//       return n - maxValid;
//    }
    

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;

        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

             if (intervals[i][0] < prevEnd) {
                count++;
            } else {
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }
}


