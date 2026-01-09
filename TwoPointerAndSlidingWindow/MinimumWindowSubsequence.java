package TwoPointerAndSlidingWindow;

public class MinimumWindowSubsequence {
    static void main() {
        String S = "KAYMBAZBDCE";
        String T = "ABE";

        System.out.println(minWindow(S, T));
    }
    public static String minWindow(String S, String T) {

        String minWin = "";
        int min = S.length() + 1;

        int j = 0;

        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == T.charAt(j)) {
                j++;
            }

            if (j == T.length()) {

                int end = i;
                j--;

                while (j >= 0) {
                    if (S.charAt(i) == T.charAt(j)) {
                        j--;
                    }
                    i--;
                }

                i++;

                if (end - i + 1 < min) {
                    min = end - i + 1;
                    minWin = S.substring(i, end + 1);
                }

                j = 0;
            }
        }
        return minWin;
    }
}
