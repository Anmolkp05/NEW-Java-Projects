package TwoPointerAndSlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "AABAAC";
        String t = "AAAC";
        System.out.println(minWindow(s,t));
    }
    public static String minWindow(String s, String t) {
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
}
