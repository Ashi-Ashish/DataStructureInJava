package com.LeetCode.Arrays;

public class NumberOfGoodPairs {
    public static void main(String[] args){
        int[] listOfNumbers = new int[]{1,2,3,1,1,3};
        int totalIdenticalPairs = numIdenticalPairs(listOfNumbers);
        System.out.println(totalIdenticalPairs);
    }

    public static int numIdenticalPairs(int[] nums) {
        int identicalPairs = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    identicalPairs = identicalPairs + 1;
                }
            }
        }
        return identicalPairs;
    }
}
