import java.util.Stack;

 class Solution {
    public boolean isValid(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // For closing brackets, check if the stack is empty or the top of the stack does not match
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check if the closing bracket matches the top of the stack
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }

        // If the stack is empty, all opening brackets had matching closing brackets
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "()" ;
        // Test cases
        System.out.println(solution.isValid(s));

    }
}
