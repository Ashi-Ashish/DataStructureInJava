package com.mypractice.lecture_15;

import com.mypractice.lecture_2.ArrayIntroduction;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {


        int[] nums = {34, 45, 4,34, 56, 356};

        quicksort(nums, 0, nums.length);

        System.out.println(Arrays.toString(nums));

    }

    public static void quicksort(int[] nums, int start, int end){
        if (end - start <= 1){
            return;
        }

        int p = pivot(nums, start, end);

        quicksort(nums, start,p);
        quicksort(nums, p+1,end);
    }

    public static int pivot(int[] nums, int start, int end) {
        int p = (end - start)/2;

        ArrayIntroduction.swap(nums, p, end-1);

        p = end - 1;

        int j = start;

        for (int i = start; i < end; i++) {
            if (nums[i] < nums[p]){
                ArrayIntroduction.swap(nums, i, j);
                j++;
            }
        }

        ArrayIntroduction.swap(nums, p, j);

        return j;
    }
}