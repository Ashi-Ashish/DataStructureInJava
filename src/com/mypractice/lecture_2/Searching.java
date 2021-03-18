package com.mypractice.lecture_2;


public class Searching {
    public static void main(String[] args) {

        int[] nums={144,244,344,544,644,744};

        int index =binarySearch(nums, 544);
        System.out.println(index);
    }

    public static int linearSearch(int[] nums,int target){

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums,int target){

        int start=0;
        int end=nums.length-1;

        while (start <= end){
            int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }else if (nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;

            }
        }
        return -1;
    }

    public static int pipeSearch(int[] nums,int target){

        int start=0;
        int end=nums.length-1;

        while (start <= end){

            int mid=(start+end)/2;

            if(nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                if(mid-1>=start && nums[mid-1]<target){
                    return mid;
                }
                end=mid-1;
            }else{
                if (mid + 1 <= end && nums[mid]+1>target) {
                    return mid+1;

                }
                start=mid+1;
            }
        }
        return -1;
    }
}
