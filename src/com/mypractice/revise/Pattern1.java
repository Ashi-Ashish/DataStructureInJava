package com.mypractice.revise;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 0;

        while (row < n) {

            int col = 0;

            while (col < n - row) {
                System.out.print(col + 1 + " ");
                col++;
            }

            col = 0;
            while (col < 2 * row - 1) {
                System.out.print("* ");
                col++;
            }


            System.out.println();
            row++;
        }
    }
}
