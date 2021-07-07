package me.load.hackerrank;

/**
 * Created by yinsanwen on 2017/7/7.
 */

import java.util.Scanner;

public class ComparetheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        // Complete this function
        int aScore = 0;
        int bScore = 0;

        if (a0 > b0) {
            aScore++;
        } else if (a0 < b0)
            bScore++;

        if (a1 > b1) {
            aScore++;
        } else if (a1 < b1)
            bScore++;

        if (a2 > b2) {
            aScore++;
        } else if (a2 < b2)
            bScore++;

        return new int[]{aScore,bScore};


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}



