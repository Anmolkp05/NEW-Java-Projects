package TwoPointerAndSlidingWindow;


import java.util.*;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abba"));

    }
    public static int lengthOfLongestSubstring(String s){
        /*int maxLength = 0;
        for(int i =0;i<s.length();i++){

            int[] hash = new int[255];
            for(int j = i ;j<s.length();j++){                       //TC = o(N^2)//
                                                                    //SC = o(256)    //
                if(hash[s.charAt(j)]==1){
                    break;
                }
                int currLength = j-i+1;
                maxLength= Math.max(currLength,maxLength);
                hash[s.charAt(j)]=1;
            }
        }
        return maxLength;*/


        /*

        TC = O(n)
        SC = O(256)
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        int left = 0 , right=0, maxlength=0;
        while(right<s.length()){
            if(hash[s.charAt(right)] !=-1 ){
                if(hash[s.charAt(right)]>=left){
                    left = hash[s.charAt(right)]+1;
                }
            }
            int currLength = right-left+1;
            maxlength = Math.max(currLength,maxlength);
            hash[s.charAt(right)]= right;
            right++;
        }
        return maxlength;
        */




        /*

        TC = O(n)
        SC = O(K)  K = number of unique characters
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxlength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;

         */

        //TC = O(n)
        //SC = O(K)  K = number of unique characters

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxlength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            int lastIndex = map.getOrDefault(c, -1);   //if (map.containsKey(c) && map.get(c) >= left) {
            if (lastIndex >= left) {
                left = lastIndex + 1;
            }
            map.put(c, right);
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;







    }


}
