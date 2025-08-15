public class CheckPalindrome {
    public static void main(String[] args) {
        int n =121;
        System.out.println(isPalindrome(n));

    }
    public static  boolean isPalindrome(int n) {
        if (n==0){
            return true;
        }
        else{
            int rev = 0;
            int pal = n;
            while(n!=0){
                int rem = n%10;
                rev = rev*10+rem;
                n = n/10;

            }
            /*if(rev==pal){
                return true;


            }
            else{
                return false;
            }*/
            return rev == pal;

        }

    }

}
