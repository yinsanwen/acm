package me.load.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Demo class
 *
 * @author yinsanwen
 * @date 2019/9/23
 */
public class No239_SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(nums[0]);

        for (int i = 1; i < k; i++) {

        }
        return nums;
    }

    public static void main(String[] args) {
        String a = "\u4f18\u79c0";
        String b = "\u5c39\u4e09\u6587";
        System.out.println(a);
        System.out.println(b);
    }

}
