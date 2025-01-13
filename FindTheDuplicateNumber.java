//Floyd's Tortoise and Hare algorithm, which is an efficient way to find the duplicate number in an array where there is exactly one duplicate. This solution works because the problem guarantees that the input array contains only one duplicate number and all other numbers are distinct.


public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        FindTheDuplicateNumber finder = new FindTheDuplicateNumber();
        int result = finder.findDuplicate(nums);

        // Print the result
        System.out.println("Duplicate number is: " + result);
    }
    public int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}

