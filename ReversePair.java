public class ReversePair {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1};
        System.out.println(reversePairs(nums));
    }


        public static int reversePairs(int[] nums) {
            return mergeSort(nums, 0, nums.length - 1);
        }

        public static int mergeSort(int[] nums, int left, int right) {
            if (left >= right) {
                return 0;
            }

            int mid = left + (right - left) / 2;

            int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);

            count += countReversePairs(nums, left, mid, right);

            merge(nums, left, mid, right);

            return count;
        }

        public static int countReversePairs(int[] nums, int left, int mid, int right) {
            int count = 0;
            int j = mid + 1;

            for (int i = left; i <= mid; i++) {
                while (j <= right && nums[i] > 2L * nums[j]) {
                    j++;
                }
                count += (j - (mid + 1));
            }

            return count;
        }

        public static void merge(int[] nums, int left, int mid, int right) {
            int[] temp = new int[right - left + 1];
            int i = left, j = mid + 1, k = 0;

            while (i <= mid && j <= right) {
                if (nums[i] <= nums[j]) {
                    temp[k++] = nums[i++];
                } else {
                    temp[k++] = nums[j++];
                }
            }

            while (i <= mid) {
                temp[k++] = nums[i++];
            }

            while (j <= right) {
                temp[k++] = nums[j++];
            }

            System.arraycopy(temp, 0, nums, left, temp.length);
        }
    }





