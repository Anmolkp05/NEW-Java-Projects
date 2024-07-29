public class DifferenceOfString {
    public static void main(String[] args) {
       String s ="anmol";
       String t ="swetaa";
                System.out.println(findTheDifference(s,t));
    }
        public static char findTheDifference(String s, String t) {
            int total = 0 ;

            for (int i =0 ;i<t.length();i++)
            {
                total=total+t.charAt(i);

            }
            for(int i=0;i<s.length();i++)
            {
                total  = total-s.charAt(i);

            }
            return (char) total  ;
        }
    }


