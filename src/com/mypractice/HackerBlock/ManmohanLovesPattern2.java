package com.mypractice.HackerBlock;

import java.util.Scanner;

public class ManmohanLovesPattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                if (row == 0) {
                    System.out.print("1");
                } else if (col == 0 || col == row) {
                    System.out.print(row);
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
