package me.load.leetcode;

import java.util.*;

/**
 *
 * 工作个数是N，工人个数是M
 * 先使用排序对工作进行排序 Olog(N)
 * 再对工人的能力进行排序 Olog(M)
 * 然后使用双指针进行顺序匹配 O(Max(M,N))
 */


public class MostProfitAssigningWork_826 {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        List jobs = new ArrayList<Job>();
        for (int i = 0; i < difficulty.length; i++) {
            jobs.add(new Job(difficulty[i], profit[i]));
        }

        Collections.sort(jobs);
        Arrays.sort(worker);

        int jobPoint = jobs.size() - 1;
        int wokerPoint = worker.length - 1;

        int maxProfit = 0;
        while (jobPoint >= 0 && wokerPoint >= 0) {
            if (canDoThisJob((Job) jobs.get(jobPoint), worker[wokerPoint])) {
                maxProfit += ((Job) jobs.get(jobPoint)).profit;
                wokerPoint--;
            } else {
                jobPoint--;
            }
        }
        return maxProfit;
    }

    private boolean canDoThisJob(Job job, int ability) {
        return ability >= job.difficulty;
    }


    class Job implements Comparable<Job> {
        int difficulty;
        int profit;

        public Job(int difficulty, int profit) {
            this.difficulty = difficulty;
            this.profit = profit;
        }

        @Override
        public int compareTo(Job other) {
            return profit - other.profit;
        }
    }

    public static void main(String[] args) {
        MostProfitAssigningWork_826 testCase = new MostProfitAssigningWork_826();
        int[] difficulty = new int[]{68,35,52,47,86};
        int[] profit = new int[]{67,17,1,81,3};
        int[] worker = new int[]{92,10,85,84,82};
        System.out.println(testCase.maxProfitAssignment(difficulty,profit,worker));

    }
}