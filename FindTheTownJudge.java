public class FindTheTownJudge {
    public static void main(String[] args)
    {
        int n = 3;
        int[][] trust = { {1, 3}, {2, 3} };

        int judge = findJudge(n, trust);

        if (judge != -1)
        {
            System.out.println("The town judge is: " + judge);
        }
        else
        {
            System.out.println("No town judge found.");
        }
    }

    public static int findJudge(int n, int[][] trust)
    {
        int[] trustScore = new int[n + 1];

        for (int[] t : trust) {
            trustScore[t[0]]--;
            trustScore[t[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustScore[i] == n - 1) {
                return i;          }
        }

        return -1;
    }
}
