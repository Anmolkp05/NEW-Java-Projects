import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcdabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);

    }
    public static int lengthOfLongestSubstring(String s) {
//        Map<Character,Integer> map=new HashMap<>();
//        int start=0,len=0;
//
//        for(int end=0;end<s.length();end++){
//            char c=s.charAt(end);
//
//            if(map.containsKey(c)){
//                if(start<=map.get(c)){
//                    start=map.get(c)+1;
//                }
//            }
//
//            len=Math.max(len,end-start+1);
//            map.put(c,end);
//        }
//        return len;

        int max = 0;
        for(int i=0; i<s.length(); i++){
            int[] hash = new int[256];
            Arrays.fill(hash, -1);

            int len = 0;
            for(int j=i; j<s.length(); j++){
                if(hash[s.charAt(j)] != -1){
                    break;
                }
                hash[s.charAt(j)]++;
                len = j-i+1;
            }
            max = Math.max(len,max);
        }
        return max;
    }
}

