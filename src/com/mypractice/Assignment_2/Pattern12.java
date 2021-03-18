package com.mypractice.Assignment_2;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int k = 0;
        int row = 0;

        while (k < n) {
            int col = 0;
            while (col <= n / 2 - row) {
                System.out.print("* ");
                col++;
            }
            col = 0;
            while (col <= 2 * row) {
                System.out.print("  ");
                col++;
            }
            col = 0;
            while (col <= n / 2 - row) {
                System.out.print("* ");
                col++;
            }
            if (k < n / 2) {
                row++;
            } else if (k >= n / 2) {
                row--;
            }
            k++;
            System.out.println();


        }

    }
}
