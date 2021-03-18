package com.mypractice.HackerBlock;

import java.util.Scanner;

public class PatternMagic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 0;
        int k = 1;
        int l = n;
        while (k < 2 * n) {
            int col = 1;
            while (col < 2 * n) {

                if (col <= n - row || col >= l) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                col++;
            }
            if (k < n) {
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
