package me.load.leetcode;


/**
 * 题目为了保证有解，一定需要保证threshold>= nums.length
 * 所以nums数组的最大值一定是一个解。
 * 1是理论上可能的最小解。
 * 所以在1~max(nums)中进行二分求解即可。
 */
public class FindtheSmallestDivisorGivenaThreshold_1283 {

    public int smallestDivisor(int[] nums, int threshold) {
        // 找到数组的最大值
        int maxOfNums = 0;
        for (int a : nums) {
            if (a > maxOfNums) {
                maxOfNums = a;
            }
        }

        //二分查找
        int left = 1;
        int right = maxOfNums;
        while (left < right) {
            int middle = (left + right) / 2;
            int divideAndSum = divideAndSum(nums, middle);
            if (divideAndSum <= threshold) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return left;
    }

    private int divideAndSum(int[] nums, double divisor) {
        int sum = 0;
        for (int a : nums) {
            sum += Math.ceil(a / divisor);
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 5, 9};
        int threshold = 6;
        FindtheSmallestDivisorGivenaThreshold_1283 example = new FindtheSmallestDivisorGivenaThreshold_1283();

        System.out.print(example.smallestDivisor(nums, threshold));

        System.out.print(7 / 2);
    }


}
