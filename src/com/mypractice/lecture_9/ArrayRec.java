package com.mypractice.lecture_9;

public class ArrayRec {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 8, 9,4};

//        System.out.println(find(nums, 0, 8));
//        System.out.println(sorted(nums,0));
        int max=nums[0];
//        System.out.println(findIndex(nums,0,8));
        System.out.println(count(nums,0,4));
    }

    public static boolean find(int[] nums, int index, int target) {

        if (nums.length == index) {
            return false;
        }

        boolean present = nums[index] == target;
        return present || find(nums, index + 1, target);
    }

    public static boolean sorted(int[] nums, int index) {

        if (nums.length-1 == index) {
            return true;
        }

        boolean present = nums[index] <= nums[index+1];
        return present && sorted(nums, index + 1);
    }

    public static int findIndex(int[] nums, int index, int target) {

        if (nums.length == index) {
            return -1;
        }
        if (nums[index]==target){
            return index;
        }

        return findIndex(nums,index+1,target);

    }

    public static int count(int[]nums,int index, int target){
        if(index==nums.length){
            return 0;
        }
        int c=count(nums,index+1, target);

        if (nums[index]==target){
            c=c+1;
        }
        return c;
    }


    public static int maxValueIndex(int[] nums,int index,int max){

        if (nums.length==index){
            return 1;
        }
        return 1;
    }
}
