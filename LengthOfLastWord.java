public class LengthOfLastWord {
    public static void main(String[] args) {

        String  str ="fly to the monday";
        System.out.println(lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(String s) {
    String str = s.trim();
        int count=0;
    for (int i = str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) != ' ') {
            count++;
        } else {
            break;
        }
    }
            return count ;
            }

        }





