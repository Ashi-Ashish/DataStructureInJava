package com.mypractice.revise;

import java.util.Scanner;

public class DSidedArrow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int blank = n - 2;
        int row = 0;

        int k = 0;
        while (k < n) {
            int col = 0;
            int l = 0;
            int num = row + 1;
            while (l < 2 * n - 1) {

                if (col > blank && num > 0) {
                    System.out.print(num + " ");

                } else {
                    System.out.print("  ");
                }
                if (l < n - 1) {

                    if (col > blank) {
                        num--;
                    }
                    col++;
                } else {

                    if (col > blank) {
                        num++;
                    }
                    col--;
                }
                l++;
            }


            System.out.println();
            if (k < n / 2) {
                blank = blank - 2;
                row++;
            } else {
                blank += 2;
                row--;
            }
            k++;
        }
    }
}
