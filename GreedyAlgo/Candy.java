package GreedyAlgo;

import java.util.*;

public class Candy {
    static void main() {
        int[] rating = {1,0,2};
        System.out.println(candy(rating));
    }
    //TC = 0(5N) -> 0(N)
    //sc= 0(2n)  ->0(N)
//    public static int candy(int[] ratings) {
//        int n = ratings.length;
//
//        int[] left = new int[n];
//        int[] right = new int[n];
//        Arrays.fill(left, 1);   //0(N)
//        Arrays.fill(right, 1);  //0(N)
//
//        for (int i = 1; i < n; i++) {    //0(N)
//            if (ratings[i] > ratings[i - 1]) {
//                left[i] = left[i - 1] + 1;
//            } else {
//                left[i] = 1;
//            }
//        }
//        //int curr = 1, right = 1;
//        //int sum = Math.max(1, left[n-1]);
//        for (int i = n - 2; i >= 0; i--) {   //0(N)
//            if (ratings[i] > ratings[i + 1]) {
//                right[i] = right[i + 1] + 1;
//                // curr = right+1;
//            } else {
//                left[i] = 1;
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {    //0(N)
//             sum = sum + Math.max(left[i],right[i]);
//
//        }
//        return sum;
//    }


    //TC = 0(3N) -> 0(N)
    //sc=  0(N)
      public static int candy(int[] ratings) {
        int n = ratings.length;

        int[] left = new int[n];  //sc = 0(N)
        Arrays.fill(left, 1);   //0(N)

        for (int i = 1; i < n; i++) {   //0(N)
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int curr = 1, right = 1;
        int sum = Math.max(1, left[n-1]);
        for (int i = n - 2; i >= 0; i--) {   //0(N)
            if (ratings[i] > ratings[i + 1]) {
                curr = right+1;
                right=curr;

            } else {
                left[i] = 1;
            }
            sum = sum + Math.max(left[i],curr);
        }

        return sum;
    }

}

