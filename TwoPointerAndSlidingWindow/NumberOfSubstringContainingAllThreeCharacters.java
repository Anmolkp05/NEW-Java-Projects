package TwoPointerAndSlidingWindow;

public class NumberOfSubstringContainingAllThreeCharacters {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }
    public static int numberOfSubstrings(String s) {



        /*
        //TC=O(N^2)
        //SC = O(1)
        int count = 0;
        for(int i=0;i<s.length();i++){
            int[] hash = new int[3];
            for(int j=i;j<s.length();j++){
                hash[s.charAt(j)-'a']=1;
                if((hash[0]+hash[1]+hash[2])==3){
                    count +=1;    //WE CAN DO COUNT= COUNT += (s.length-j) bcz humlog ko pta hai ek bad agr abc aa gya to uska bad k sara b calculate hga hi to  hmlg yha direct add karke break kr denge
                }
            }

        }
        return count;

         */

        int[] hash = {-1,-1,-1};
        int lastSeen = 0;
        for(int i=0;i<s.length();i++){

            hash[s.charAt(i)-'a'] = i;
            if(hash[0]!=-1&&hash[1]!=-1&&hash[2]!=-1){
                lastSeen += Math.min(hash[0],(Math.min(hash[1],hash[2])))+1;

            }

        }
        return lastSeen;




    }
}
