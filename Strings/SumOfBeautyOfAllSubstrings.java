package Strings;

public class SumOfBeautyOfAllSubstrings {
    static void main() {

        String s = "aabcbaa";
        System.out.println(beautySum(s));
    }
    public static int beautySum(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            int[] freq = new int[26];
            for(int j = i; j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int beauty  = maxFreq(freq) - minFreq(freq);
                sum = sum + beauty;
            }
        }
        return sum;

    }
    public static int minFreq(int[] arr){
        int minCount = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                minCount = Math.min(minCount,arr[i]);
            }
        }
        return minCount;
    }
    public static int maxFreq(int[] arr){
        int maxCount = 0;
        for(int i = 0;i<arr.length;i++){
                maxCount = Math.max(maxCount,arr[i]);
        }
        return maxCount;
    }
}
