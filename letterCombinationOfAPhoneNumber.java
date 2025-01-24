import java.util.ArrayList;
import java.util.List;

public class letterCombinationOfAPhoneNumber {
    public static void main(String[] args) {

        List<String> result = letterCombinations("23");
        System.out.println(result);


    }
    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        String[] phoneMap = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> result = new ArrayList<>();

        backtrack(digits, 0, new StringBuilder(), result, phoneMap);

        return result;
    }

    private static void backtrack(String digits, int index, StringBuilder current, List<String> result, String[] phoneMap) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phoneMap[digits.charAt(index) - '0'];

        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(digits, index + 1, current, result, phoneMap);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
