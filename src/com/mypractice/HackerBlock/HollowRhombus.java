package com.mypractice.HackerBlock;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < n - row - 1) {
                System.out.print(" ");
                col++;
            }

            col = 0;
            while (col < n) {
                if (row == 0 || row == n - 1) {
                    System.out.print("*");
                } else {
                    if (col == 0 || col == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
