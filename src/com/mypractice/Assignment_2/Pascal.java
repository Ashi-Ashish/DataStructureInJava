package com.mypractice.Assignment_2;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col <= row) {
                if (col == 0) {
                    count = 1;
                } else {
                    count = count * (row - col + 1) / col;
                }
                System.out.print(count + " ");
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
