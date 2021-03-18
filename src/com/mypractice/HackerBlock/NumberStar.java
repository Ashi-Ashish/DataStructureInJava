package com.mypractice.HackerBlock;

import java.util.Scanner;

public class NumberStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(col + " ");
            }
            for (int col = 0; col < 2 * row - 1; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
