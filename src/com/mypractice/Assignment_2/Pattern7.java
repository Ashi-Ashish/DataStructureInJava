package com.mypractice.Assignment_2;

import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 1;

        while (row <= n) {

            int col = 1;

            while (col <= row) {

                if (row % 2 == 0) {
                    if (col == 1 || col == row) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    System.out.print("1");
                }
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
