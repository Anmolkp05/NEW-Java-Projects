package Arrays;


import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    static void main() {
        int[] arr = {1,1,2,2,3};
        System.out.println(singleNumber(arr));

    }
    public static int singleNumber(int[] nums) {
        //tc =0(N^2)
        //Sc =(1)
//        int n = nums.length;
//        for(int i =0;i<n;i++){
//            int count =0;
//            for(int j = 0;j<n;j++){
//                if(nums[i]==nums[j]){
//                    count++;
//                }
//            }
//            if(count==1){
//                return nums[i];
//            }
//        }return 0;



        //TC = 0(3N)
        //SC=0(MAX)
//        int n = nums.length;
//        int max = 0;
//        for(int i =0;i<n;i++){
//            max = Math.max(max,nums[i]);
//        }
//
//        int[] hash = new int[max+1];
//        for(int i =0;i<n;i++){
//            hash[nums[i]]++;
//        }
//        for(int i =0;i<hash.length;i++){
//            if(hash[i]==1){
//                return i;
//            }
//        }
//        return 0;


        //tc=0(2N)
        //sc=0(N)
        Map<Integer, Integer> map = new HashMap<>();

         for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                return nums[i];
            }
        }

        return 0;



        //TC = 0(N)
        //SC = 0(1)
//        int xor=nums[0];
//        for(int i=1;i<nums.length;i++){
//            xor = xor^nums[i];
//        }
//        return xor;
    }
}
