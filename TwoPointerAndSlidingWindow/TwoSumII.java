package TwoPointerAndSlidingWindow;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumII {
    static void main() {
        int[] num = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(num, target)));

    }

    //Using Array for Loop
    // Time = O(N)^2
    // Space = O(1)
//    public static int[] twoSum(int[] num, int target) {
//        for(inti =0; i<num.length; i++){
//            int sum;
//            for(int j =i+1; j<num.length; j++){
//                sum = num[i]+num[j];
//                if(sum == target){
//                    return new int[] {num[i] , num[j]};
//                }
//            }
//
//
//            }
//        return new int[]{0};
//
//    }


    //HASHMAP APPROACH
    //TIME O(N)
    //SPACE 0(N)
//    public static int[] twoSum(int[] num, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < num.length; i++) {
//            int complement = target-num[i];
//            if(map.containsKey(complement)){
//                return new int[] {map.get(complement)+1,i+1};
//            }
//            map.put(num[i],i);
//        }
//        return new int[] {0};
//    }



    //Two pointer Approach
    //Time: O(N)
    //Space: O(1)
    public static int[] twoSum(int[] num, int target) {
        int left =0;
        int right = num.length-1;

        while(left<right){
            int sum = num[left] + num[right];
            if(sum > target) {
                right--;
            } else if(sum < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }

        }

        return new int[]{0};
    }



}
