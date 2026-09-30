package Strings;

import java.util.Stack;

public class RemoveOutermostParantheses {
    static void main() {


        System.out.println(removeOuterParentheses("(()())"));
    }
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                if (!stack.isEmpty()) {
                    result.append(c);
                }
                stack.push(c);

            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    result.append(c);
                }
            }
        }

        return result.toString();

    }
}
