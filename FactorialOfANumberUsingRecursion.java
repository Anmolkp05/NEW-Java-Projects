public class FactorialOfANumberUsingRecursion {
    public static void main(String[] args) {
        System.out.println(Factorialofnumbers(4));

    }
    public static int Factorialofnumbers(int N){
        if (N == 0) {
            return 1;
        }
        return N * Factorialofnumbers(N - 1);
    }
}
