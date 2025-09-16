public class PrintNTo1usingRecursion {
    public static void main(String[] args) {
        printNumbers1(5);

    }

    public static void printNumbers1(int n) {

        if (n > 0) {
            System.out.println(n);
            printNumbers1(n - 1);

        }
    }
}
