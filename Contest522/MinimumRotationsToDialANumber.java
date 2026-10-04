package Contest522;

public class MinimumRotationsToDialANumber {
    static void main() {
        String s = "1200210200";
        System.out.println(minRotations(s));
    }
    public static int minRotations(String s) {

        int rotations = 0;

        int current = 0;

        for (int i = 0; i < s.length(); i++) {
            int target = s.charAt(i) - '0';
            int diff = Math.abs(current - target);

            int circularDiff = 10 - diff;

            rotations += Math.min(diff, circularDiff);

            current = target;
        }

        return rotations;
    }
}
