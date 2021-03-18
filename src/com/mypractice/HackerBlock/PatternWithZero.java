package com.mypractice.HackerBlock;

import java.util.Scanner;

public class PatternWithZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if (col == 0 || row == col) {
                    System.out.print(row + 1 + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
