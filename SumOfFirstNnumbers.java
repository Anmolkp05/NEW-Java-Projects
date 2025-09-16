public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        System.out.println(SumOfFirstNnumbers(4));

    }
    public static int SumOfFirstNnumbers(int N){
        if (N == 0) {
            return 0;
        }
        return N + SumOfFirstNnumbers(N - 1);
    }
}
