package Heaps;

import java.util.*;

public class ReplaceElementsByItsRankInTheArray {

    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6};
        int[] result = replaceWithRank(arr);
        System.out.println(Arrays.toString(result));
    }

    // Brute Force Approach
    //TC = O(N²)
    //sc = 0(N)
//    public static List<Integer> replaceWithRank(int[] arr) {
//        List<Integer> rankList = new ArrayList<>();   //sc = 0(n)
//
//        for (int i = 0; i < arr.length; i++) {     //o(n)
//            Set<Integer> smaller = new HashSet<>();    //sc = O(n)
//
//            for (int j = 0; j < arr.length; j++) {    //o(n)
//                if (arr[j] < arr[i]) {
//                    smaller.add(arr[j]);     //O(n)   as
//                }
//            }
//
//            int rank = smaller.size() + 1;
//            rankList.add(rank);
//        }
//
//        return rankList;
//    }

    //Sorting Approach
    //TC = O(n log n)
    //Sc = 0(n)

//    public static int[] replaceWithRank(int[] arr) {
//        int[] sortedArr = arr.clone();    //TC&SC  for copying and storing O(n)
//
//        Arrays.sort(sortedArr);   //O(n log n)
//
//        HashMap<Integer, Integer> rankMap = new HashMap<>();
//
//        int rank = 1;
//
//        for (int num : sortedArr) {
//            if (!rankMap.containsKey(num)) {   //O(n)   sc=0(n)
//                rankMap.put(num, rank);
//                rank++;
//            }
//        }
//
//        int[] result = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            result[i] = rankMap.get(arr[i]);  //O(n)    sc=0(n)
//        }
//
//        return result;
//    }


    //Using min heap
    //TC = (0(n log n)+0(n log n)+O(n)+O(n))  = 0(n log n)
    //SC = (0(n)+0(n)+0(n))  = 0(n)
    public static int[] replaceWithRank(int[] arr) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();      //sc = 0(n)

        for (int num : arr) {
            pq.add(num);   //O(n log n)   each add operation take 0(log n)
        }

        HashMap<Integer, Integer> rankMap = new HashMap<>();   //sc = 0(n)

        int rank = 1;

        while (!pq.isEmpty()) {
            int num = pq.poll();    //O(n log n)

            if (!rankMap.containsKey(num)) {    //O(n)   Each map operation is:0(1)
                rankMap.put(num, rank);        //O(n)
                rank++;
            }
        }

        int[] result = new int[arr.length];    //sc = 0(n)

        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);    //O(n)
        }

        return result;
    }
}