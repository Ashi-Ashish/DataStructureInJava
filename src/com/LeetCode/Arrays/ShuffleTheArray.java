package com.LeetCode.Arrays;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//Example 1:
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args){
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7}, 3)));
    }

    public static int[] shuffle(int[] nums, int n){
        int[] shuffledArray = new int[2 * n];
        int x = 0, y = n;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0){
                shuffledArray[i] = nums[x++];
            }else{
                shuffledArray[i] = nums[y++];
            }
        }
        return shuffledArray;
    }
}
