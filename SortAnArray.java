import java.util.HashMap;
import java.util.Map;

public class SortAnArray {
    public static void main(String[] args) {
        SortAnArray solution = new SortAnArray();
        int[] nums = {5, 2, 9, 1, 5, 6};
        int[] sortedArray = solution.sortArray(nums);
        for (int num : sortedArray) {
            System.out.print(num + " ");  // Output: 1 2 5 5 6 9
        }


    }
    public int[] sortArray(int[] nums) {
        Map<Integer,Integer > map = new HashMap<>();
        int min = nums[0],max = nums[0];
        for(int i = 0 ;i<nums.length;i++){
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);

            }
            if(nums[i]<min)
            {
                min = nums[i];
            }
            if(nums[i]>max)
            {
                max = nums[i];
            }
        }
        int index = 0 ;
        for (int i = min ; i<= max; i++){
            while (map.getOrDefault(i,0)>0){
                nums[index]=i;
                index++;
                map.put(i,map.get(i)-1);
            }
        }
        return nums;
    }
}
