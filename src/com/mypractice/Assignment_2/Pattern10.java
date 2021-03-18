package com.mypractice.Assignment_2;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int first = 0;
        int second = 1;
        int temp;

        int row = 0;
        while (row < n) {
            int col = 0;
            while (col <= row) {

                temp = second;
                second = first + second;
                System.out.print(first + " ");
                first = temp;

                col++;
            }
            row++;
            System.out.println();
        }
    }
}
