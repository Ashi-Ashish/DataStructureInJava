package com.mypractice.revise;

import java.util.Scanner;

public class HollowD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 0;
        int k = 0;
        while (k < n) {
            int col = 0;
            int l = 0;
            while (l < n) {

                if (col <= n / 2 - row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                if (l < n / 2) {
                    col++;
                } else {
                    col--;
                }

                l++;
            }
            System.out.println();
            if (k < n / 2) {
                row++;
            } else {
                row--;
            }
            k++;
        }
    }
}
