package TwoPointerAndSlidingWindow;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] arr = { 1,1,0,0,0,1};


        System.out.println(LongestOnes(arr,2));
    }
    public static int LongestOnes(int[] nums,int k ){
        int maxlength=0;
        int s = nums.length;



        /*
       // TC = O(N^2)
        //SC = O(1)

        for(int i =0;i<s;i++){
            int Zeroes= 0;

            for(int j=i;j<s;j++){
                if(nums[j]==0){
                    Zeroes++;
                }
                if(Zeroes<=k){
                     int length = j-i+1;
                    maxlength = Math.max(maxlength,length);
                }
                else {
                    break;
                }



            }
        }
*/

        //TC = 0(N)+0(N) = 0(2N)
        //SC= O(1)

        /*
        int l = 0,r=0,Zeroes=0;
        while(r<s){
            if (nums[r]==0) {
                Zeroes++;
            }
            while(Zeroes>k){
                if(nums[l]==0){
                    Zeroes--;

                }
                l++;
            }

            int length = (r - l) + 1;
            maxlength = Math.max(maxlength,length);
            r++;
        }


         */


        //TC = 0(N)
        //SC= O(1)

        int l = 0,r=0,Zeroes=0;
        while(r<s){
            if (nums[r]==0) {
                Zeroes++;
            }
            if (Zeroes>k){
                if(nums[l]==0){
                    Zeroes--;

                }l++;

            }
            if (Zeroes <= k) {

            int length = (r - l) + 1;
            maxlength = Math.max(maxlength,length);}
            r++;
        }


        return maxlength;
    }

}
