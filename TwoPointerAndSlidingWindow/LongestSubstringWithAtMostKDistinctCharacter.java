    package TwoPointerAndSlidingWindow;

    import java.util.*;

    public class LongestSubstringWithAtMostKDistinctCharacter {
        public static void main(String[] args) {
            String s = "aaaaa";
            int k = 2;

            System.out.println(kDistinctChar(s, k));
        }

        public static int kDistinctChar(String s, int k) {


           /* //TC = 0(N^2)
            //SC = 0()
            int maxLen = 0;
            for (int i = 0; i < s.length(); i++) {
                HashMap<Character, Integer> map = new HashMap<>();
                for (int j = i; j < s.length(); j++) {
                    map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                    if (map.size() > k) {
                        break;
                    }
                    maxLen = Math.max(maxLen, j - i + 1);
                }

            }
            return maxLen;
            */

            /*
            //TC =0(2N)
            //SC = 0(K)
            Map<Character, Integer> freq = new HashMap<>();

             int left = 0;
            int maxLen = 0;
            int right = 0;

            while(right<s.length()) {
                char c = s.charAt(right);
                freq.put(c, freq.getOrDefault(c, 0) + 1);

                while (freq.size() > k) {
                    char leftChar = s.charAt(left);
                    freq.put(leftChar, freq.get(leftChar) - 1);
                    if (freq.get(leftChar) == 0) {
                        freq.remove(leftChar);
                    }
                    left++;
                }

                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }

            return maxLen;

             */

            Map<Character, Integer> freq = new HashMap<>();

            int left = 0;
            int maxLen = 0;
            int right = 0;

            while(right<s.length()) {
                char c = s.charAt(right);
                freq.put(c, freq.getOrDefault(c, 0) + 1);

                 if(freq.size() > k) {
                    char leftChar = s.charAt(left);
                    freq.put(leftChar, freq.get(leftChar) - 1);
                    if (freq.get(leftChar) == 0) {
                        freq.remove(leftChar);
                    }
                    left++;
                }


                if (freq.size() <= k) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
                right++;
            }

            return maxLen;


        }
    }