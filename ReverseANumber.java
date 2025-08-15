public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(120));
    }

        public static int reverseNumber(int n) {

            if (n == 0) {
                return 0;
            } else {
                int rev = 0 ;
                while (n != 0) {
                    int rem = n % 10;
                    rev = rev * 10 + rem;
                    n = n / 10;
                }
                return rev;
            }


        }
}