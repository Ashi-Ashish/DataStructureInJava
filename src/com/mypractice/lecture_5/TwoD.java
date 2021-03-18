package com.mypractice.lecture_5;

import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {21, 22, 23, 24}
        };
        v_wave(nums);

        /*int[][] nums=new int[3][4];
        Scanner s=new Scanner(System.in);

        input(nums,s);
        display(nums);
        h_wave(nums);
    */

    }

    public static void display(int [][] nums){

        for (int r = 0; r < nums.length; r++) {
            int[] row=nums[r];

            for (int c = 0; c < row.length; c++) {
                System.out.print(row[c] + " ");
            }
            System.out.println();
        }
    }
    public static void input(int [][] nums,Scanner s){

        for (int r = 0; r < nums.length; r++) {
            int[] row=nums[r];

            for (int c = 0; c < row.length; c++) {
                row[c]=s.nextInt();
            }
            System.out.println();
        }
    }

    public static void h_wave(int [][] nums){

        for (int r = 0; r < nums.length; r++) {
            int[] row=nums[r];

            if((r%2)==0){
                for (int c = 0; c < row.length; c++) {
                    System.out.print(row[c] + " ");
                }
            }else {
                    for (int c = row.length-1; c >=0 ; c--) {
                        System.out.print(row[c] + " ");
                    }
            }
            System.out.println();
        }
    }

    public static void v_wave(int [][] nums){

        for (int c = 0; c <= nums.length; c++) {
            if(c%2==0)
                for (int r = 0; r < nums.length; r++) {
                    System.out.print(nums[r][c]+" ");
                }else{
                for (int r = nums.length-1; r >= 0; r--) {
                    System.out.print(nums[r][c]+" ");

                }
            }

        }
    }
}
