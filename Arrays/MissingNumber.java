package Arrays;


public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {4,6,7,8,9,5,3,0,2,1};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
//        //TC = 0(N^2)
//        //sc = 0(1)
//        for(int i=0;i<=nums.length;i++){
//            boolean found = false;
//            for(int j=0;j<nums.length;j++){
//                if(nums[j]==i){
//                    found = true;
//                    break;
//                }
//
//            }
//            if(!found){
//                return i;
//            }
//        }
//        return -1;



//        //sc= 0(N)
//        //TC =0(2N)
//        int n = nums.length;
//        int[] hash = new int[n + 1];
//        for(int i=0;i<n;i++){
//            hash[nums[i]] =1;
//        }
//        for(int j=0;j<hash.length;j++){
//            if(hash[j]==0){
//                return j;
//            }
//        }
//        return -1;



//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum = sum + nums[i];
//        }
//
//            int actualSum = (nums.length * (nums.length + 1) / 2);
//            int missingNum = actualSum - sum;
//
//            return missingNum;

        int n = nums.length;
            int xor1 = 0;
            int xor2 = 0;
            for(int i =0;i<n;i++){
                xor1 = xor1^nums[i];
                xor2 = xor2^(i+1);
            }
            xor2 = xor2^n;
            return xor1^xor2;



        }
    }

