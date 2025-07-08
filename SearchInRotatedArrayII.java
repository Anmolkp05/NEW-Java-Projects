public class SearchInRotatedArrayII {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        int target1 = 0;
        System.out.println( target1 + " in the array? " + search(nums1, target1));


        int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
        int target2 = 3;
        System.out.println( target2 + " in the array? " + search(nums2, target2));


        int[] nums3 = {1, 1, 3, 1};
        int target3 = 3;
        System.out.println(target3 + " in the array? " + search(nums3, target3));

        System.out.println();
    }

        public static boolean search(int[] nums, int target)
        {
            int left = 0, right = nums.length - 1;

            while (left <= right)
            {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target)
                    return true;

                if (nums[left] == nums[mid] && nums[mid] == nums[right])
                {
                    left++;
                    right--;
                }
                else if (nums[left] <= nums[mid])
                {
                    if (nums[left] <= target && target < nums[mid])
                    {
                        right = mid - 1;
                    }
                    else
                    {
                        left = mid + 1;
                    }
                }
                else
                {
                    if (nums[mid] < target && target <= nums[right])
                    {
                        left = mid + 1;
                    }
                    else
                    {
                        right = mid - 1;
                    }
                }
            }

            return false;
        }
    }
