package com.mypractice.HackerBlock;

import java.util.Scanner;

public class Mountain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 0;
        while (row < n) {
            int col = 0;
            int k = 0;
            while (k < 2 * n - 1) {

                if (col <= row) {
                    System.out.print(col + 1 + "\t");
                } else {
                    System.out.print(" \t");
                }
                k++;
                if (k < n) {
                    col++;
                } else {
                    col--;
                }

            }
            row++;
            System.out.println();
        }

    }
}
