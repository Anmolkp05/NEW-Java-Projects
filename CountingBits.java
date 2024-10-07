import java.util.Arrays;
public class CountingBits {
    public static void main(String[] args) {
        int n = 2;
        CountingBits countingBits = new CountingBits();
        int[] result = countingBits.countBits(n);

        System.out.println(Arrays.toString(result));
    }
    public int[] countBits(int n) {
        int[] bitsCount = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            bitsCount[i] = bitsCount[i >> 1] + (i & 1);
        }

        return bitsCount;
    }
}

