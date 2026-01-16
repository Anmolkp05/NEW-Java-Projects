package Strings;

import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses {
    static void main() {
        System.out.println(maxDepth("1+(2*3)+((8)/4)"));;

    }

//T.C = O(n)
//S.C = O(n)
        public static int maxDepth(String s) {
            int result = 0;
            Stack<Character> st = new Stack<>();

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    st.push(ch);
                } else if (ch == ')') {
                    st.pop();
                }

                result = Math.max(result, st.size());
            }

            return result;
        }
    }


   /*
//T.C = O(n)
//S.C = O(1)
    public class Solution {
        public int maxDepth(String s) {
            int result = 0;
            int openBrackets = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    openBrackets++;
                } else if (ch == ')') {
                    openBrackets--;
                }

                result = Math.max(result, openBrackets);
            }

            return result;
        }
    }
}

    */
