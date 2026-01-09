package TwoPointerAndSlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "AABAAC";
        String t = "AAAC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {


        /*
        //TC = O(n² + n*m) → roughly O(n²) for most cases.  IF M=N
        //SC =0(M)
        int  minLen = Integer.MAX_VALUE ;
        int sIndex = -1;
        for(int i=0;i<s.length();i++){

            HashMap<Character,Integer> map = new HashMap<>();


            for(int j=0;j<t.length();j++) {
                char c = t.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
                int count =0;
                for(int k=i;k<s.length();k++){
                    if(map.getOrDefault(s.charAt(k), 0)>0){
                         count += 1;
                    }
                    map.put(s.charAt(k), map.getOrDefault(s.charAt(k), 0) - 1);

                    if(count==t.length()){
                        int currentWindowLen = k - i + 1;

                         if (currentWindowLen < minLen) {
                            minLen = currentWindowLen;
                            sIndex = i;
                        }
                        break;
                    }




                }



        }  return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLen);

    }

         */
        int minLen = Integer.MAX_VALUE;
        int sIndex = -1;
        int r = 0;
        int l = 0;


        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        while (r < s.length()) {
            if (map.getOrDefault(s.charAt(r), 0) > 0){
                count += 1;
            }

            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) - 1);

            while (count == t.length()) {
                int currentWindowLen = r - l + 1;

                if (currentWindowLen < minLen) {
                    minLen = currentWindowLen;
                    sIndex = l;
                }
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) + 1);

                if (map.get(leftChar) > 0) {
                    count--;
                }
                l++;




            }
            r++;

        }
        return sIndex == -1 ? "" : s.substring(sIndex, sIndex + minLen);

    }
}
