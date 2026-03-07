package Heaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceElementsByItsRankInTheArray {

    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6};
        List<Integer> result = replaceWithRank(arr);
        System.out.println(result);
    }

    public static List<Integer> replaceWithRank(int[] arr) {
        List<Integer> rankList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            Set<Integer> smaller = new HashSet<>();

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    smaller.add(arr[j]);
                }
            }

            int rank = smaller.size() + 1;
            rankList.add(rank);
        }

        return rankList;
    }
}