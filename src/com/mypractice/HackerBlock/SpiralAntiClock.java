package com.mypractice.HackerBlock;

import java.util.Scanner;

public class SpiralAntiClock {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int[][] nums = new int[x][y];

        for (int m = 0; m < x; m++) {
            int[] row = nums[m];

            for (int n = 0; n < y; n++) {
                row[n] = s.nextInt();
            }
        }

        int top = 0;
        int left = 0;
        int bottom = x - 1;
        int right = y - 1;

        while (top <= bottom && left <= right) {
            for (int r = top; r <= bottom && left <= right; r++) {
                System.out.print(nums[r][left] + ", ");

            }
            left++;

            for (int c = left; c <= right && top <= bottom; c++) {
                System.out.print(nums[bottom][c] + ", ");
            }
            bottom--;


            for (int r = bottom; r >= top && left <= right; r--) {
                System.out.print(nums[r][right] + ", ");
            }
            right--;


            for (int c = right; c >= left && top <= bottom; c--) {
                System.out.print(nums[top][c] + ", ");
            }
            top++;

        }
        System.out.println("END");
    }
}
