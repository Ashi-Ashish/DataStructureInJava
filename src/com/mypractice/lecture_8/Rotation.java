package com.mypractice.lecture_8;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int[] nums=new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        int d=s.nextInt();

        leftRotate(nums,d);

        System.out.println(Arrays.toString(nums));
    }
    public static int[] leftRotate(int[] nums, int d){

        d=d%nums.length;

        int[] temp= new int[d];

        for (int i = 0; i < d; i++) {
            temp[i]=nums[i];
        }

        for (int i = d; i <nums.length ; i++) {
            nums[i-d]=nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i+nums.length-d]=temp[i];
        }
        return nums;
    }

    public static void leftRotateTime(int[] nums){

    }
}
