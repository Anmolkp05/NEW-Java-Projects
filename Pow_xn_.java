public class Pow_xn_ {
    public static void main(String[] args) {

        Pow_xn_ solution = new Pow_xn_();

        System.out.println(solution.myPow(2.0, 10));
        System.out.println(solution.myPow(2.0, -2));
    }
    public double myPow(double x, int n) {
        if (n == Integer.MIN_VALUE) {
            return myPow(x, n / 2) * myPow(x, n / 2);
        }

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        return result;
    }
}



