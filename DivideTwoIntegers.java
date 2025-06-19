public class DivideTwoIntegers {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int result = divide(dividend, divisor);
        System.out.println(result);

    }

        public static int divide(int dividend, int divisor) {
             if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }

            boolean negative = (dividend < 0) ^ (divisor < 0);

            long absDividend = Math.abs((long) dividend);
            long absDivisor = Math.abs((long) divisor);
            long quotient = 0;

            while (absDividend >= absDivisor) {
                long temp = absDivisor, multiple = 1;
                 while (absDividend >= (temp << 1)) {
                    temp <<= 1;
                    multiple <<= 1;
                }
                absDividend -= temp;
                quotient += multiple;
            }

            quotient = negative ? -quotient : quotient;

           return (int) Math.min(Math.max(quotient, Integer.MIN_VALUE), Integer.MAX_VALUE);
        }
}
