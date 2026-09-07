package Arrays;


public class SingleNumber {
    static void main() {
        int[] arr = {1,1,2,2,3};
        System.out.println(singleNumber(arr));

    }
    public static int singleNumber(int[] nums) {
        int xor=nums[0];
        for(int i=1;i<nums.length;i++){
            xor = xor^nums[i];
        }
        return xor;
    }
}
