package TwoPointerAndSlidingWindow;

import java.util.*;

public class LongestSubstringWithExactlyKDistinctCharacter {
    static void main() {
        String s = "aabacbebebe";
        int k = 3;

        System.out.println(longestKSubstring(s,k));
    }

        public static int longestKSubstring(String s, int k) {


            /*
            //TC = 0(N2)
            //SC= 0(K)  , 0(1)for arrays as we haven't use any hash and the sized is fized
            int maxLen=-1;
            for (int i = 0; i < s.length(); i++) {
                HashMap<Character, Integer> map = new HashMap<>();

                //int[] freq = new int[26];  // Array for lowercase letters
                //int distinct = 0;



                for (int j = i; j < s.length(); j++) {
                    map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                    //int idx = s.charAt(j) - 'a';
                    //if (freq[idx] == 0) distinct++;  // KOI BHI NEW CHARAC ANE SE DISTNCT BARHEGA JISHE PATA CHL JAYEGA KI KITNA DISTINCT ELEMENT HAI
                    //freq[idx]++;


                    //if (distinct == k) {
                    if (map.size() == k) {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }

                    //if (distinct > k) {
                    if (map.size() > k) {
                        break;
                    }
                }
            }

            return maxLen;

             */

            /*
            //TC = 0(N)
            //SC = (K)
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
            */

            int[] freq = new int[26];
            int left = 0, right = 0, maxLen = -1;
            int distinct = 0;

            while (right < s.length()) {
                int idx = s.charAt(right) - 'a';
                if (freq[idx] == 0) distinct++;
                freq[idx]++;

                while (distinct > k) {
                    int leftIdx = s.charAt(left) - 'a';
                    freq[leftIdx]--;
                    if (freq[leftIdx] == 0) distinct--;
                    left++;
                }

                if (distinct == k) {
                    maxLen = Math.max(maxLen, right - left + 1);
                }

                right++;
            }

            return maxLen;
        }
    }

