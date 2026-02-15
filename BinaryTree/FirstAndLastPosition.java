package BinaryTree;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {7, 7, 5, 5, 5, 8};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

        public static int[] searchRange(int[] nums, int target) {
            int[] arr = new int[2];
            arr[0] = arr[1] = -1;


            boolean foundFirst = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    if (!foundFirst) {
                        arr[0] = i;
                        foundFirst = true;
                    }
                    arr[1] = i;
                }
            }

            return arr;
        }
    }







