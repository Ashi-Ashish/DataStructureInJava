package com.mypractice.HackerBlock;

import java.util.Scanner;

public class WavePrint {
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
        v_wave(nums, x, y);
    }

    public static void v_wave(int[][] nums, int x, int y) {

        for (int n = 0; n < y; n++) {
            if (n % 2 == 0)
                for (int m = 0; m < x; m++) {
                    System.out.print(nums[m][n] + ", ");
                }
            else {
                for (int m = x - 1; m >= 0; m--) {
                    System.out.print(nums[m][n] + ", ");

                }
            }
        }
        System.out.print("END");
    }
}
