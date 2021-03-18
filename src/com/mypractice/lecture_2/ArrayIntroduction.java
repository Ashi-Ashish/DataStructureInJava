package com.mypractice.lecture_2;

public class ArrayIntroduction {

    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i]=i;
        }
        display(nums);
        swap(nums,2,8);
        display(nums);
        swap(nums);
        display(nums);
        System.out.println(max(nums));

    }
    public static void display(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void swap(int[] nums,int a,int b){

        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;

    }

    public static int max(int[] nums){

        int m=nums[0];
        for (int i = 0; i < 10; i++) {
            if (nums[i]>m)
                m=nums[i];
        }
        return m;
    }

    public static void swap(int[] nums){

        for (int i = 0; i < nums.length/2; i++) {
            int t=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=t;
        }
    }
}