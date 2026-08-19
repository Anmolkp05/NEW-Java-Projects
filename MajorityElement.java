public class MajorityElement {
    public static void main(String[] args)
    {
        int nums[]={3,2,3};
        System.out.println(MajorityElement(nums));

    }

    //TC = 0(n2)
    //sc = 0(1)
    public static int MajorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count>(nums.length/2)){
                    return nums[i];
                }
            }
        }
        return 0;
    }
//    public static int MajorityElement(int[] nums)
//    {
//
//        int cand=0;
//        int count=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            if(count==0)
//            {
//                cand=nums[i];
//            }
//
//            if(cand==nums[i])
//            {
//                count++;
//            }
//            else
//            {
//                count--;
//            }
//
//        }
//        return cand;
//
//    }
}