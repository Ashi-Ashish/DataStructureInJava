package com.LeetCode.Arrays;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

public class TwoSum {

    public static void main(String[] args){
        int[] nums = new int[] {2, 3, 4, 5};
        int target  = 8;
        int[] index = twoSum(nums, target);
        System.out.println(index[0]+","+index[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    index = new int[]{i, j};
                    return index;
                }
            }
        }
        return index;
    }
}