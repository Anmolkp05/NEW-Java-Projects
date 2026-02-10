package GreedyAlgo;

public class JumpGameI {
    static void main() {
        int[] nums = {4, 3, 7, 1, 2};

        if (canJump(nums))
            System.out.println("Possible to reach the last index");
        else
            System.out.println("Not possible to reach the last index");

    }
     public static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }
}
