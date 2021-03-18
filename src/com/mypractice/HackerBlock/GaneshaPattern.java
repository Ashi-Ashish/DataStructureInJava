package com.mypractice.HackerBlock;

import java.util.Scanner;

public class GaneshaPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < n) {
                if ((col == 0 && row < n / 2) || col == n / 2 || (col == n - 1 && row > n / 2) || (row == 0 && col > n / 2) || row == n / 2 || (row == n - 1 && col < n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
