package TwoPointerAndSlidingWindow;

import java.util.*;

public class LongestSubstringWithExactlyKDistinctCharacter {
    static void main() {
        String s = "aabacbebebe";
        int k = 3;

        System.out.println(longestKSubstring(s,k));
    }

        public static int longestKSubstring(String s, int k) {

            Map<Character, Integer> freq = new HashMap<>();
            int left = 0, maxLen = -1;

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                freq.put(c, freq.getOrDefault(c, 0) + 1);

                while (freq.size() > k) {
                    char leftChar = s.charAt(left);
                    freq.put(leftChar, freq.get(leftChar) - 1);
                    if (freq.get(leftChar) == 0) freq.remove(leftChar);
                    left++;
                }

                if (freq.size() == k) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }
            }

            return maxLen;
        }
    }

