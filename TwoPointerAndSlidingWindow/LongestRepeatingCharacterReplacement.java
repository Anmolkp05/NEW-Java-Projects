package TwoPointerAndSlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;


        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k){

        /*
        int maxLength = 0;


        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            int maxFreq = 0;
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'A']++;

                maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);

                int windowSize = j - i + 1;

                 int replacements = windowSize - maxFreq;

                if (replacements <= k) {
                    maxLength = Math.max(maxLength, windowSize);
                }
            }
        }*/


        /*
        int[] freq = new int[26];

        int left = 0, right = 0;

        int maxCount = 0;


        int maxLength = 0;

        while (right < s.length()) {

            freq[s.charAt(right) - 'A']++;

            maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);

            right++;
        }

         */



        int[] freq = new int[26];

        int left = 0, right = 0;

        int maxCount = 0;


        int maxLength = 0;

        while (right < s.length()) {

            freq[s.charAt(right) - 'A']++;

            maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']);

            if((right - left + 1) - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);

            right++;
        }

        return maxLength;
    }

}
