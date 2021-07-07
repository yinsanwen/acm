package me.load.hackerrank.dp;

import java.util.Scanner;

/**
 * 整理出动态规划的公式
 * 设F(n,q)表示使用前q种硬币凑齐n元的方法树
 * 那么有 F(n,q) = F(n,q-1) + F(n-V(q),q)
 * V(q)表示第q个硬币的面值大小。
 *
 * Created by yinsanwen on 2017/7/7.
 */
public class TheCoinChangeProblem {


    public static long[] F;
    public static long[] V;

    static void getWays(long n, long[] c){
        // Complete this function
        return ;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
//        long ways = getWays(n, c);
    }

}
