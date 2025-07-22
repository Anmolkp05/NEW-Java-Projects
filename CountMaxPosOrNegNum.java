public class CountMaxPosOrNegNum {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 3, -1, 0, 4};
        int result = maximumCount(nums);

        System.out.println("Maximum of Positive or Negative count: " + result);


    }

        public static int maximumCount(int[] nums) {
            int pos = 0;
            int neg = 0;

            for (int num : nums) {
                if (num > 0) {
                    pos++;
                } else if (num < 0) {
                    neg++;
                }
            }

            return Math.max(pos, neg);
        }
    }


