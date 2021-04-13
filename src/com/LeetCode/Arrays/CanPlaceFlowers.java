package com.LeetCode.Arrays;

//You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
//Example 1:
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true

public class CanPlaceFlowers {
    public static void main(String[] args){
        System.out.println(canPlaceFlowers(new int[]{0,0,0,0,1}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int spaceAvailable = 0;
        int prevPointer = -1;
        int currPointer = 0;
        for (; currPointer < flowerbed.length; currPointer++) {

            if (flowerbed[currPointer] == 1){
                int diff = currPointer - prevPointer;
                if( diff > 2){
                    spaceAvailable += diff % 2 == 0 || prevPointer == -1 ? (diff - 1) / 2 : (diff - 2) / 2;
                }
                prevPointer = currPointer;
            }
        }
        int diff = currPointer - prevPointer - 1;
        if (diff >= 1){
            if (flowerbed.length == 1){
                spaceAvailable = 1;
            }else if (prevPointer == -1 && currPointer == flowerbed.length){
                spaceAvailable = (diff + 1) / 2;
            }else {
                spaceAvailable += diff % 2 == 0 || prevPointer == -1 ? (diff) / 2 : (diff - 1) / 2;
            }
            if(flowerbed.length == 1){
                spaceAvailable++;
            }
        }
        return spaceAvailable >= n;
    }
}
