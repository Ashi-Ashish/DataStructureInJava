package com.LeetCode.Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//Example 1:
//Input: nums = [3,2,3]
//Output: 3

public class MajorityElement {
    public static void main(String[] args){
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                map.put(nums[i], value + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        int maxValue = Integer.MIN_VALUE;
        int maxKey = 0;
        Iterator hmIterator = map.entrySet().iterator();

        while (hmIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            if((int)mapElement.getValue() > maxValue) {
                maxValue = (int)mapElement.getValue();
                maxKey = (int)mapElement.getKey();
            }
        }
        return maxKey;
    }
}
