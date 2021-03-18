package com.mypractice.Nagarro;

import java.util.Scanner;

public class MatrixSort {
    public static void main(String[] args) {

        int[][] arr = {{2, 3, 4, 7}, {3, 3, 3, 3}, {1, 1, 1, 1}, {2, 4, 2, 2}};
        int col = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j][col] > arr[j + 1][col]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
