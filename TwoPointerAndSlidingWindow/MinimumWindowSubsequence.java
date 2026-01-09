package TwoPointerAndSlidingWindow;

public class MinimumWindowSubsequence {
    static void main() {
        String S = "geeksforgeeks";
        String T = "eksrg";

        System.out.println(minWindow(S, T));
    }
    public static String minWindow(String S, String T) {


        /*

        //TC = 0(N^2)
        //SC = 0(1)
        String answer = "";
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < S.length(); i++) {

            int t = 0;

            for (int j = i; j < S.length(); j++) {

                if (S.charAt(j) == T.charAt(t)) {
                    t++;
                }

                if (t == T.length()) {

                    int len = j - i + 1;
                    if (len < minLen) {
                        minLen = len;
                        answer = S.substring(i, j + 1);
                    }
                    break;
                }
            }
        }
        return answer;

         */


        //TC = 0(N^2)
        //SC = 0(1)

        String minWin = "";
        int min = S.length() + 1;

        int j = 0;

        for (int i = 0; i < S.length(); i++) {   //0(N)

            if (S.charAt(i) == T.charAt(j)) {
                j++;
            }

            if (j == T.length()) {

                int end = i;
                j--;

                while (j >= 0) {      //0(N)
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
