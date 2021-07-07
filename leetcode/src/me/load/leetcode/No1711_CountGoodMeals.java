package me.load.leetcode;

public class No1711_CountGoodMeals {

    public int countPairs(int[] deliciousness) {
        int count = 0;
        for (int i = 0; i < deliciousness.length - 1; i++) {
            for (int j = i + 1; j < deliciousness.length; j++) {
                if (powerOf2(deliciousness[i] + deliciousness[j])) {
                    System.out.println(i + "-" + j + "        " + (deliciousness[i] + deliciousness[j]) );
                    count++;
                    count = count % 1000000007;
                }
            }
        }
        return count;
    }

    boolean powerOf2(int num) {

        // 快速判断一个数是否为2的幕
        return (num & (num - 1)) == 0;
    }


    public static void main(String[] args) {
        No1711_CountGoodMeals test = new No1711_CountGoodMeals();
        int[] deliciousness = new int[]{2160, 1936, 3, 29, 27, 5, 2503, 1593, 2, 0, 16, 0, 3860, 28908, 6, 2, 15, 49, 6246, 1946, 23, 105, 7996, 196, 0, 2, 55, 457, 5, 3, 924, 7268, 16, 48, 4, 0, 12, 116, 2628, 1468};
        int result = test.countPairs(deliciousness);
        System.out.println(result);
    }

}
