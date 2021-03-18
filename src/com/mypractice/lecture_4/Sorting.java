package com.mypractice.lecture_4;

import com.mypractice.lecture_2.ArrayIntroduction;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] nums = {4, 3, 1, 2, 0};

        bubble(nums);
        ArrayIntroduction.display(nums);
//        selection(nums);
//        instertion(nums);
//        reverse(nums);
      /*  inverse(nums);
        ArrayIntroduction.display(inverse(nums));
      */
    }

    public static void bubble(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    ArrayIntroduction.swap(nums, j, j + 1);
                }
            }
        }
    }

    public static void selection(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int m = maxiIndex(nums, 0, nums.length - i - 1);
            ArrayIntroduction.swap(nums, m, nums.length - i - 1);

        }
    }

    public static int maxiIndex(int[] nums, int start, int end) {

        int m = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[m]) {
                m = i;
            }
        }
        return m;
    }

    public static void instertion(int[] nums) {


        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j > 0; j--) {

                if (nums[j] < nums[j - 1]) {
                    ArrayIntroduction.swap(nums, j, j - 1);
                } else {
                    break;
                }

            }
        }
    }

    public static void reverse(int[] nums) {

        int t;

        for (int i = 0; i < nums.length / 2; i++) {
            t = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = t;
            System.out.println(Arrays.toString(nums));

//            ArrayIntroduction.swap(nums,i,nums.length-1-i);
            //          ArrayIntroduction.display(nums);

        }
    }

    public static int[] inverse(int[] nums) {

        int[] res = new int[nums.length];
        int val;
        for (int i = 0; i < nums.length; i++) {

            val = nums[i];
            res[val] = i;

        }
        return res;
    }
}


