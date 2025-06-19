public class MaxProductSubarray {
    public static void main(String[] args) {
       int[] nums = {1, 5, -3, 9, 2, -8};
       System.out.println("the array is: " + maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }
}


