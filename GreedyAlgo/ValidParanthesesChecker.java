package GreedyAlgo;

import java.util.Scanner;

public class ValidParanthesesChecker {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        if (isValid(input, 0, 0)) {
            System.out.println("Valid parenthesis string");
        } else {
            System.out.println("Invalid parenthesis string");
        }

    }
    public static  boolean isValid(String s, int index, int open) {

        if (open < 0) return false;

        if (index == s.length()) return open == 0;

        char c = s.charAt(index);

        if (c == '(') {
            return isValid(s, index + 1, open + 1);
        }

        else if (c == ')') {
            return isValid(s, index + 1, open - 1);
        }

       else {
            return isValid(s, index + 1, open) ||
                    isValid(s, index + 1, open + 1) ||
                    isValid(s, index + 1, open - 1);
        }
    }
}

