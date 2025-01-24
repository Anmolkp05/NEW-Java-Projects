import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println(result);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> combination = new ArrayList<>();
            backtrack(candidates, target, 0, combination, result);
            return result;
        }

        private void backtrack(int[] candidates, int target, int start, List<Integer> combination, List<List<Integer>> result) {
            if (target == 0) {
                result.add(new ArrayList<>(combination));
                return;
            }

            for (int i = start; i < candidates.length; i++) {
                if (candidates[i] > target) continue;

                combination.add(candidates[i]);
                backtrack(candidates, target - candidates[i], i, combination, result);
                combination.remove(combination.size() - 1);
            }
        }
    }
