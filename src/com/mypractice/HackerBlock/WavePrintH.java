package com.mypractice.HackerBlock;

import java.util.Scanner;

public class WavePrintH {
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
        h_wave(nums, x, y);
    }


    public static void h_wave(int[][] nums, int x, int y) {

        for (int m = 0; m < x; m++) {
            int[] row = nums[m];

            if ((m % 2) == 0) {
                for (int n = 0; n < y; n++) {
                    System.out.print(row[n] + ", ");
                }
            } else {
                for (int n = y - 1; n >= 0; n--) {
                    System.out.print(row[n] + ", ");
                }
            }
        }
        System.out.print("END");
    }
}
