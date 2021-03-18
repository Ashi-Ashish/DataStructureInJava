package com.mypractice.HackerBlock;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 0;
        int k = 0;
        int l = n / 2;
        while (k < n) {
            int col = 0;
            while (col < n) {

                if (col <= n / 2 - row || col >= l) {
                    System.out.print("* \t");
                } else {
                    System.out.print("  \t");
                }
                col++;
            }
            if (k < n / 2) {
                row++;
                l++;
            } else {
                row--;
                l--;
            }

            System.out.println();
            k++;
        }
    }
}
