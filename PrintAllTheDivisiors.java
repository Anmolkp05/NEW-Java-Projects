import java.util.ArrayList;
import java.util.Collections;

public class PrintAllTheDivisiors {
    public static void main(String[] args) {
        int num = 10;
        printDivisors(num);
        System.out.println(getDivisors(num));

    }
    public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {                           //TC = O(N)  but we can reduce it therefore the lower one
                System.out.println(i);
            }
        }
    }

    public static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divisorsList = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisorsList.add(i);
                if (i != n / i) {                               //TC= 0(sqrt(N))   optimal approach
                    divisorsList.add(n / i);
                }
            }
        }
        Collections.sort(divisorsList);

        return divisorsList;
    }


}
