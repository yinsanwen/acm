package me.load.hackerrank.dp;


public class Eggs {


    public static int[][] TRY_NUMS_EVERY_FLOORNUM_AND_EGGNUM;

    public static void main(String[] args) {


        int floorNum = 100;
        int eggNum = 2;

        TRY_NUMS_EVERY_FLOORNUM_AND_EGGNUM = new int[floorNum + 1][eggNum + 1];
        initArray(TRY_NUMS_EVERY_FLOORNUM_AND_EGGNUM);

        System.out.println(eggBreak(floorNum, eggNum));

        System.out.println(TRY_NUMS_EVERY_FLOORNUM_AND_EGGNUM);
    }


    // 需要经过尝试的次数
    public static int eggBreak(int floorNum, int eggNum) {

        System.out.println("floorNum: " + floorNum + " eggNum :" + eggNum);


        if (TRY_NUMS_EVERY_FLOORNUM_AND_EGGNUM[floorNum][eggNum] > -1) {
            return TRY_NUMS_EVERY_FLOORNUM_AND_EGGNUM[floorNum][eggNum];
        }

        if (floorNum == 0) {
            return 0;
        }

        if (eggNum == 1) {
            return floorNum;
        }


        int[] everyTryNums = new int[floorNum + 1];
        everyTryNums[0] = Integer.MAX_VALUE;

        for (int k = 1; k <= floorNum; k++) {
            int tryNumsWhenK = Math.max(1 + eggBreak(k - 1, eggNum - 1), 1 + eggBreak(floorNum - k, eggNum));
            everyTryNums[k] = tryNumsWhenK;
        }


        TRY_NUMS_EVERY_FLOORNUM_AND_EGGNUM[floorNum][eggNum] = min(everyTryNums);

        return TRY_NUMS_EVERY_FLOORNUM_AND_EGGNUM[floorNum][eggNum];
    }

    public static int min(int[] arrays) {

        int a = 1;

        int min = arrays[1];

        for (int i = 2; i < arrays.length; i++) {
            if (arrays[2] < min) {
                min = arrays[2];
            }
        }

        return min;

    }


    public static void initArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = -1;
            }
        }
    }


}
