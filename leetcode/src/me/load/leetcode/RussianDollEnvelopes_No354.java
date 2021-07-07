package me.load.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class RussianDollEnvelopes_No354 {



    public int maxEnvelopes(int[][] envelopes) {

        Arrays.sort(envelopes);
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] - o2[0]);
            }
        });

        return 0;

    }





}
