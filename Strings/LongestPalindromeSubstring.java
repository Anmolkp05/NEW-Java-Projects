package Strings;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        LongestPalindromeSubstring lps = new LongestPalindromeSubstring();
        String testString = "babad";
        String result = lps.longestPalindrome(testString);
        System.out.println("Longest Palindromic Substring: " + result);
    }

    public String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                if (isPalindrome(s, i, j)) {

                    int length = j - i + 1;

                    if (length > longest.length()) {
                        longest = s.substring(i, j + 1);
                    }
                }
            }
        }

        return longest;
    }

    public boolean isPalindrome(String s, int i, int j) {

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;




//        int start = 0, maxlength = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int odd = expand(s, i, i);
//            int even = expand(s, i, i + 1);
//            int len = Math.max(odd, even);
//            if (len > maxlength) {
//                maxlength = len;
//                start = i - (len-1) / 2;
//            }
//        }
//        return s.substring(start, start + maxlength);
//    }
//    int expand(String s, int left, int right) {
//        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//            left--;
//            right++;
//        }
//        return right - left - 1;
    }
}
