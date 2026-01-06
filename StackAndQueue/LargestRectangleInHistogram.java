package StackAndQueue;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3, 1};
        int n = 7;
        System.out.println("The largest area in the histogram is " + largestarea(arr, n));

    }
    public static int largestarea(int[] arr, int n) {

        //Brute force approach to find the area   yahaa width index number se lia hai (j-i+1)  yaha pe i and j ke bich kitna indexxes hai wo nikalne ke lie use hua hai and ushe hi width nikala hai

        //TC = o(n^2)    not good at all

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, arr[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;







    }

}
