package com.mypractice.revise;

import java.util.Scanner;

public class ArrayWaveCol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        int [][] arr = new int [m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = s.nextInt();
            }
        }

        for (int col = 0; col < n; col++){

            if (col % 2 == 0){
                for (int row = 0; row < m; row++){
                    System.out.print(arr[row][col] + ", ");
                }
            } else {
                for (int row = m-1; row >= 0; row--){
                    System.out.print(arr[row][col] + ", ");
                }
            }
        }
        System.out.println("END");

    }
}
