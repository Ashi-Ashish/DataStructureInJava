package com.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

//Input: n = 4, rounds = [1,3,1,2]
//Output: [1,2]
//Explanation: The marathon starts at sector 1. The order of the visited sectors is as follows:
//1 --> 2 --> 3 (end of round 1) --> 4 --> 1 (end of round 2) --> 2 (end of round 3 and the marathon)
//We can see that both sectors 1 and 2 are visited twice and they are the most visited sectors. Sectors 3 and 4 are visited only once.
//Example 2:
//Input: n = 2, rounds = [2,1,2,1,2,1,2,1,2]
//Output: [2]

public class MostVisitedSectorInCircularTrack {

    public static void main(String[] args){
        System.out.println(mostVisited(2, new int[]{2,1,2,1,2,1,2,1,2}));
    }

    public static List<Integer> mostVisited(int n, int[] rounds){
        int[] sector = new int[n];
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < rounds.length - 1; i++) {
            int j = rounds[i];
            while (j != rounds[i + 1]){
                sector[j - 1]++;
                j++;
                if (j > n) j = 1;
            }
        }
        sector[rounds[rounds.length - 1] - 1]++;
        for (int i = 0; i < n; i++) {
            if (sector[i] > maxValue) maxValue = sector[i];
        }
        List<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (sector[i] == maxValue) newList.add(i + 1);
        }
        return newList;
    }
}
