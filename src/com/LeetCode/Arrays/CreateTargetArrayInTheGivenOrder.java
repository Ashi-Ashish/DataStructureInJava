package com.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given two arrays of integers nums and index. Your task is to create target array under the following rules:
//Initially target array is empty.
//From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
//Repeat the previous step until there are no elements to read in nums and index.
//Return the target array.
//It is guaranteed that the insertion operations will be valid.
//Example 1:
//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//Output: [0,4,1,3,2]
//Explanation:
//nums       index     target
//0            0        [0]
//1            1        [0,1]
//2            2        [0,1,2]
//3            2        [0,1,3,2]
//4            1        [0,4,1,3,2]

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args){
        System.out.println(Arrays.toString(creatTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})));
    }

    public static int[] creatTargetArray(int[] nums, int[] index){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return  arr;
    }
}