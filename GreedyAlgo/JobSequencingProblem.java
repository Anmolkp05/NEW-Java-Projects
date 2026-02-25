package GreedyAlgo;

import java.util.Arrays;

class Job {
    int id;
    int dead;
    int profit;

    Job(int id, int dead, int profit) {
        this.id = id;
        this.dead = dead;
        this.profit = profit;
    }
}

class Solution {

    static class Result {
        int countJobs;
        int totalProfit;

        Result(int countJobs, int totalProfit) {
            this.countJobs = countJobs;
            this.totalProfit = totalProfit;
        }
    }

    public static Result jobScheduling(Job[] arr, int n) {

        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            maxDeadline = Math.max(maxDeadline, arr[i].dead);
        }

        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        int countJobs = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].dead; j > 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = i;
                    countJobs++;
                    totalProfit += arr[i].profit;
                    break;
                }
            }
        }

        return new Result(countJobs, totalProfit);
    }
}

public class JobSequencingProblem {

    public static void main(String[] args) {

        int n = 4;

        Job[] arr = {
                new Job(1, 4, 20),
                new Job(2, 1, 10),
                new Job(3, 2, 40),
                new Job(4, 2, 30)
        };

        Solution.Result ans = Solution.jobScheduling(arr, n);

        System.out.println(ans.countJobs + " " + ans.totalProfit);
    }
}