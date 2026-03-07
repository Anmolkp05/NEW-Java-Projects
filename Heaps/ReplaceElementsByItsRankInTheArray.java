package Heaps;

import java.util.*;

public class ReplaceElementsByItsRankInTheArray {

    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6};
        int[] result = replaceWithRank(arr);
        System.out.println(Arrays.toString(result));
    }

    // Brute Force Approach
//    public static List<Integer> replaceWithRank(int[] arr) {
//        List<Integer> rankList = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            Set<Integer> smaller = new HashSet<>();
//
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    smaller.add(arr[j]);
//                }
//            }
//
//            int rank = smaller.size() + 1;
//            rankList.add(rank);
//        }
//
//        return rankList;
//    }

    public static int[] replaceWithRank(int[] arr) {
        int[] sortedArr = arr.clone();

        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;

        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}