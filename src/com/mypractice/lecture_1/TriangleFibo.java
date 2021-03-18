package com.mypractice.lecture_1;

import java.util.Scanner;

public class TriangleFibo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int first = 0;
        int second = 1;
        int row = 0;
        while (row < n) {

            int col = 0;

            while (col <= row) {
                System.out.print(first + " ");

                int temp = second;
                second = first + second;
                first = temp;

                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}

