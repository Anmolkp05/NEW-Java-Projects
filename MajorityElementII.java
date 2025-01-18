import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println(majorityElement(nums1));

    }

        public static List<Integer> majorityElement(int[] nums) {
            List<Integer> result = new ArrayList<>();

            if (nums == null || nums.length == 0) {
                return result;
            }

            int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE;
            int count1 = 0, count2 = 0;

            for (int num : nums) {
                if (num == candidate1) {
                    count1++;
                } else if (num == candidate2) {
                    count2++;
                } else if (count1 == 0) {
                    candidate1 = num;
                    count1 = 1;
                } else if (count2 == 0) {
                    candidate2 = num;
                    count2 = 1;
                } else {
                    count1--;
                    count2--;
                }
            }

            count1 = 0;
            count2 = 0;
            for (int num : nums) {
                if (num == candidate1) {
                    count1++;
                } else if (num == candidate2) {
                    count2++;
                }
            }

            int n = nums.length;
            if (count1 > n / 3) {
                result.add(candidate1);
            }
            if (count2 > n / 3) {
                result.add(candidate2);
            }

            return result;
        }
    }

