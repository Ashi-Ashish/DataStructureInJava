package com.mypractice.lecture_12;

import java.util.Scanner;

public class main2D {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];
        Scanner s = new Scanner(System.in);
        input(nums, s);
        display(nums);
    }

    public static void input(int[][] nums, Scanner s) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = s.nextInt();
            }
        }
    }

    public static void display(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
