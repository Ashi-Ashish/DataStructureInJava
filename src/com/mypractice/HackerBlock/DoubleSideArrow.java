package com.mypractice.HackerBlock;

import java.util.Scanner;

public class DoubleSideArrow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int l = 0;
        while (l < n) {
            int col = n - row * 2 - 1;
            while (col > 0) {
                System.out.print("  ");
                col--;

            }
            col = 0;
            int k = 0;
            while (k < 4 * row + 1) {
                if (col < row + 1) {
                    System.out.print(row + 1 - col + " ");
                } else {
                    System.out.print("  ");
                }
                k++;
                if (k < 2 * row + 1) {
                    col++;
                } else {
                    col--;
                }
            }
            System.out.println();
            if (l < n / 2) {
                row++;
            } else {
                row--;
            }
            l++;
        }
    }
}
