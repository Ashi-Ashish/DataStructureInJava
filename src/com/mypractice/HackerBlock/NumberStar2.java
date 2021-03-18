package com.mypractice.HackerBlock;

import java.util.Scanner;

public class NumberStar2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= row) {
                    System.out.print(col + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
