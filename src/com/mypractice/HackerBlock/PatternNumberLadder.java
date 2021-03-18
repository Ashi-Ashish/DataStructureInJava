package com.mypractice.HackerBlock;

import java.util.Scanner;

public class PatternNumberLadder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int x = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}