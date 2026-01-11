package Arrays;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    static void main() {

        int[] arr  = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {

        /*

        //TC = 0(N*1) = 0(N)
        //SC - 0(N)

        HashSet<Integer> seen = new HashSet<>();


        int index = 0;

        for (int num : nums) {
            if (!seen.contains(num)) {
                seen.add(num);

                nums[index] = num;

                index++;
            }
        }
        return index;

         */

        /*
        //TC = 0(N)
        //SC = 0(1)
        int count =0;
        for(int i =0;i<nums.length;i++)
        {
            if(i<nums.length-1 && nums[i]==nums[i+1])
            {
                continue;
            }
            else
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;

        */
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;


    }

}
