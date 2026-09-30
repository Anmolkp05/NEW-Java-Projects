package Strings;

import java.util.Stack;

public class RemoveOutermostParantheses {
    static void main() {


        System.out.println(removeOuterParentheses("(()())"));
    }
    public static String removeOuterParentheses(String s) {
        //tc = 0(N)
        //sc = 0()
//        Stack<Character> stack = new Stack<>();
//        StringBuilder result = new StringBuilder();
//
//        for (char c : s.toCharArray()) {
//
//            if (c == '(') {
//                if (!stack.isEmpty()) {
//                    result.append(c);
//                }
//                stack.push(c);
//
//            } else {
//                stack.pop();
//                if (!stack.isEmpty()) {
//                    result.append(c);
//                }
//            }
//        }
//
//        return result.toString();

        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    result.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
