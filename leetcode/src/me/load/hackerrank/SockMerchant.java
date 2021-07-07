package me.load.hackerrank;

import java.util.HashSet;
import java.util.Set;

/**
 * Demo class
 *
 * @author yinsanwen
 * @date 2018/10/24
 */
public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int pair = 0;
        Set existColor = new HashSet<Integer>();

        for (int sockColor : ar) {

            if (existColor.contains(sockColor)) {
                pair ++;
                existColor.remove(sockColor);
            } else {
                existColor.add(sockColor);
            }
        }

        return pair;


    }

    public static void main(String[] args) {

        int[] allSockColor = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(9,allSockColor));

    }

}
