package StackAndQueue;

import java.util.Stack;


//TC = O(n)+O(N)
//SC = O(n)+O(n)


public class InfixToPostfix {
    public static void main(String[] args) {
        String expr = "(A+B)-C*(D/E)+F";
        String postfix = infixToPostfix(expr);
        System.out.println("Infix: " + expr);
        System.out.println("Postfix: " + postfix);
    }

    public static int Prior(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String s) {
        StringBuilder result = new StringBuilder();


        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }

                stack.pop();

            } else {
                while (!stack.isEmpty() && ((Prior(c) < Prior(stack.peek())) ||
                        (Prior(c) == Prior(stack.peek()) && c != '^'))) {

                    result.append(stack.pop());
                }
                stack.push(c);
            }

        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());

        }
        return result.toString();
    }
}

