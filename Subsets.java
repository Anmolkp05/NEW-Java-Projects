import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

         List<List<Integer>> result = subsets(nums);

         for (List<Integer> subset : result)
         {
             System.out.println(subset);
         }


    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());

        for (int num : nums) {
            int size = result.size();

            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num);
                result.add(newSubset);
            }
        }

        return result;
    }
}