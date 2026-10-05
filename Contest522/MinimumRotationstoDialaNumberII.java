package Contest522;

public class MinimumRotationstoDialaNumberII {
    static void main() {

        System.out.println(minRotations(4,"1502"));
    }
    public static int minRotations(int n, String s) {
        int total = 0;
        int current = 0;

        for (int i = 0; i < n; i++) {
            int target = s.charAt(i) - '0';

            int diff = Math.abs(current - target);
            int circularDiff = 10 - diff;

            total += Math.min(diff, circularDiff);
            current = target;
        }

        int answer = total;

        for (int k = 0; k < n; k++) {
            int before = (k == 0) ? 0 : s.charAt(k - 1) - '0';
            int first = s.charAt(k) - '0';
            int last = s.charAt(n - 1) - '0';

            int oldDiff = Math.abs(before - first);
            int oldCost = Math.min(oldDiff, 10 - oldDiff);

            int newDiff = Math.abs(before - last);
            int newCost = Math.min(newDiff, 10 - newDiff);

            int newTotal = total - oldCost + newCost;

            answer = Math.min(answer, newTotal);
        }

        return answer;
    }
}
