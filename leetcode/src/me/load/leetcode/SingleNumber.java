package me.load.leetcode;

/**
 * Demo class
 *
 * @author yinsanwen
 * @date 2019-08-21
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] example1 = new int[]{4,1,2,1,2};
        int[] example2 = new int[]{2,2,1};
        System.out.println(singleNumber(example1));
        System.out.println(singleNumber(example2));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

}
