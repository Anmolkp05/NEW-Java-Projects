import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s= "dog,cat, cat, dog";

        System.out.println(wordPattern(pattern,s));
    }

        public static boolean wordPattern(String pattern,String s){

            HashMap<Character,String> hm=new HashMap<>();
            Set<String> set=new HashSet<>();

            String[] arr=s.split(" ");
            int n = arr.length;
            if (n!=pattern.length())
            {   return false;}



            for(int i=0 ;i<n;i++)
            {
                char ch =pattern.charAt(i);

                if(hm.containsKey(ch) && !hm.get(ch).equals(arr[i]))
                {

                        return false;

                }

                else
                {
                    if (set.contains(arr[i]))
                        return false;

                    else
                    {
                        hm.put(ch,arr[i]);
                        set.add(arr[i]);
                    }

                }

            }
            return true;
        }
    }