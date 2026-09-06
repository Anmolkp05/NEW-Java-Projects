package Arrays;

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        //tc = 0(N)
        //sc=(1)
        int count =0 ;
        for (int i =0;i<nums.length;i++)
        {
            if(nums[i] !=0)
            {
                nums[count]=nums[i];
                count++;
            }

        }
        while(count<nums.length)
        {
            nums[count]=0;
            count++;
        }
    }
}