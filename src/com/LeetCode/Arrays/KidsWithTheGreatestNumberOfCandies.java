package com.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args){
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> kidsCanHaveMaxCandies = new ArrayList<>();
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxNumber){
                maxNumber = candies[i];
            }
            candies[i] = candies[i] + extraCandies;
        }
        for (int i = 0; i < candies.length; i++) {
            kidsCanHaveMaxCandies.add(candies[i] >= maxNumber);
        }
        return kidsCanHaveMaxCandies;
    }
}
