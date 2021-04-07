package com.LeetCode.Arrays;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//Link: https://leetcode.com/problems/contains-duplicate/

import java.util.Arrays;

public class ContainsDuplicate {

    public static void main (String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}