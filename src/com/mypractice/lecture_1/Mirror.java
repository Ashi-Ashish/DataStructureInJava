package com.mypractice.lecture_1;

import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 0;
        int k = 0;

        while (k < 2 * n - 1) {
            int col = 0;

            while (col <= row) {
                System.out.print("* ");
                col = col + 1;

            }
            System.out.println();
            if (k < n - 1) {
                row = row + 1;
            } else {
                row = row - 1;
            }
            k = k + 1;
        }
    }
}
